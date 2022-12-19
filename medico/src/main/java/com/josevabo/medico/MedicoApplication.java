package com.josevabo.medico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MedicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicoApplication.class, args);
	}

}
