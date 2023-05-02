package com.web.springbootcrudsqlserver;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.web")
@Configuration
@ComponentScan({"com.web"})
public class SpringbootcrudsqlserverApplication {
	
	@PostConstruct
	void started() {
	    // set JVM timezone
	    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Bangkok"));
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudsqlserverApplication.class, args);
	}

}
