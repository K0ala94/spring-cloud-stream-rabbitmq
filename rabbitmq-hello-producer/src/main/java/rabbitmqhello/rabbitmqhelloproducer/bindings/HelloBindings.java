package rabbitmqhello.rabbitmqhelloproducer.bindings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloBindings {

    @Output("helloChannel")
    MessageChannel helloChannel();
}
