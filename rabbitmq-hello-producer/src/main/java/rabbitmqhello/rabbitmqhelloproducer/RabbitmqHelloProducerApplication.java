package rabbitmqhello.rabbitmqhelloproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import rabbitmqhello.rabbitmqhelloproducer.bindings.HelloBindings;

@SpringBootApplication
@EnableBinding(HelloBindings.class)
public class RabbitmqHelloProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqHelloProducerApplication.class, args);
	}

}
