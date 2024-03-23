package com.queue.api;

import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.models.SendMessageResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class MessageApi {

    private final QueueClient client;

    @GetMapping("/sendMessage/{message}")
    public String sendMessage(@PathVariable("message") String message){
        if(null != message && message.trim()!=null) {
            SendMessageResult sendMessageResult = client.sendMessage(message);
            log.info("Message Sent with Id:{}",sendMessageResult.getMessageId());
            return  message+" sent to the queue successfully";
        }
        return "message is empty or null pls send valid message";

    }
}
