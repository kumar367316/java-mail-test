package com.java.email.api.controller;

import com.java.email.api.dto.MailRequest;
import com.java.email.api.dto.MailResponse;
import com.java.email.api.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MailController {


    @Autowired
    private EmailService service;

    @PostMapping("/sendingEmail")
    public MailResponse sendEmail(@RequestBody MailRequest request) {
        Map<String, Object> model = new HashMap<>();
        model.put("Name", request.getName());
        model.put("location", "Bangalore,India");
        return service.sendEmail(request, model);

    }

}
