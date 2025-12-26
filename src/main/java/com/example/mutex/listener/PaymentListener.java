package com.example.mutex.listener;

import com.example.mutex.PaymentRecord;
import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentListener {

    @SqsListener("payments-queue")
    public void listen(PaymentRecord message) {
        System.out.println(message.toString());
    }
}
