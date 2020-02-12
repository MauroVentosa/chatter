package com.more.chatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = {"com.more.chatter"})
@EntityScan(basePackages = {"com.more.chatter"})
@ComponentScan(basePackages = {"com.more.chatter"})
@SpringBootApplication
public class ChatterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatterApplication.class, args);
	}

}
