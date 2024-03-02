package dharmycode.apachekafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListeners {

    @KafkaListener(
            topics = "Dharmycode",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("listener received: " + data + " 🎉");

    }
}
