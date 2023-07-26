package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.data.service.IActorService;

@SpringBootApplication
public class BootDataJpaProj3JpaRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootDataJpaProj3JpaRepositoryApplication.class, args);
		IActorService service = applicationContext.getBean("actorService", IActorService.class);
		
		
	}

}
