package com.buddyevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BuddyEventsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuddyEventsConfigServerApplication.class, args);
	}
}
