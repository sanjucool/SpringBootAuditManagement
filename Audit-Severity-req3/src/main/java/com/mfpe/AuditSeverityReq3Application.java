package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuditSeverityReq3Application {

	public static void main(String[] args) {
		SpringApplication.run(AuditSeverityReq3Application.class, args);
	}

}
