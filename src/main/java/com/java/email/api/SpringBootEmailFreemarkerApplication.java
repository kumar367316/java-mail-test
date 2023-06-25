package com.java.email.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.email.api.dto.MailRequest;
import com.java.email.api.dto.MailResponse;
import com.java.email.api.service.EmailService;

@SpringBootApplication
public class SpringBootEmailFreemarkerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailFreemarkerApplication.class, args);
	}
}
