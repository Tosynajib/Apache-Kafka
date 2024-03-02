package dharmycode.apachekafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ApacheKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApacheKafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
//            kafkaTemplate.send("Dharmycode", "welcome to Kafka");
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("Dharmycode", "welcome to Kafka " + i);
            }
        };
    }

}
