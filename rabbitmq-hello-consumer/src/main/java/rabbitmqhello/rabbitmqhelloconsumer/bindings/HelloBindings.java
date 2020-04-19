package rabbitmqhello.rabbitmqhelloconsumer.bindings;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloBindings {

    public static final String HELLO = "helloChannel";

    @Input(HELLO)
    SubscribableChannel helloChannel();
}
