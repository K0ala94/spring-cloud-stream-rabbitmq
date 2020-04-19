package rabbitmqhello.rabbitmqhelloproducer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rabbitmqhello.rabbitmqhelloproducer.bindings.HelloBindings;

@RestController
public class HelloController {

    @Autowired
    private HelloBindings helloBindings;

    @GetMapping("/hello/{name}")
    public void sayHello(@PathVariable String name){
        Message<String> msg = MessageBuilder.withPayload(String.format("Hello dear %s", name)).build();
        System.out.println(String.format("Message to be sent: %s", msg.getPayload()));
        helloBindings.helloChannel().send(msg);
    }
}
