package rabbitmqhello.rabbitmqhelloconsumer.consumers;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import rabbitmqhello.rabbitmqhelloconsumer.bindings.HelloBindings;

@EnableBinding(HelloBindings.class)
public class HelloSubscriber {

    @StreamListener(target = HelloBindings.HELLO)
    public void printHelloMessage(String msg){
        System.out.println(msg);
    }
}
