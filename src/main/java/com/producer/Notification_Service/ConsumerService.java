package com.producer.Notification_Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "booking-topic",groupId = "MyGroup")
    public void consume(BookingModel bookingModel){
        log.info("Booking Service Notification --> {} ",bookingModel);
    }
}
