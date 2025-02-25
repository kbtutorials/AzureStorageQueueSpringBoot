package com.queue;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@Slf4j
@EnableScheduling
public class QueueServiceApplication  {
   private  final static Logger logger = LoggerFactory.getLogger(QueueServiceApplication.class);


	public static void main(String[] args) {


		SpringApplication.run(QueueServiceApplication.class, args);
	}


}
