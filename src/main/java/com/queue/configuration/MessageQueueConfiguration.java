package com.queue.configuration;

import com.azure.storage.queue.QueueClient;
import com.azure.storage.queue.QueueClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageQueueConfiguration {

    @Bean
    public QueueClient getQueueClient(){
        QueueClient client = new QueueClientBuilder()
                .endpoint("https://queue4.queue.core.windows.net/")
                .queueName("queue4")
                .sasToken("sv=2022-11-02&ss=bfqt&srt=sco&sp=rwdlacupiytfx&se=2024-12-31T14:32:24Z&st=2024-03-23T06:32:24Z&spr=https&sig=sK2nBICpeGFOuAk4tuxxwgN%2Bfna46k33nGYlfUzUC7I%3D")
                .buildClient();
        client.createIfNotExists();
        return client;
    }
}
