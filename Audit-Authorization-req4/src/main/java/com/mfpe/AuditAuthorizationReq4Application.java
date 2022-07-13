package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin("*")
@SpringBootApplication
@EnableSwagger2
public class AuditAuthorizationReq4Application {

	public static void main(String[] args) {
		SpringApplication.run(AuditAuthorizationReq4Application.class, args);
	}

}
