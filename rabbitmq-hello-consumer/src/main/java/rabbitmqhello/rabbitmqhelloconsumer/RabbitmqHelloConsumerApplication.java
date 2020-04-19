package rabbitmqhello.rabbitmqhelloconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import rabbitmqhello.rabbitmqhelloconsumer.bindings.HelloBindings;

@SpringBootApplication
public class RabbitmqHelloConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqHelloConsumerApplication.class, args);
	}

}
