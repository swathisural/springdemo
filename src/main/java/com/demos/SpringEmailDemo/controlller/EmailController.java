package com.demos.SpringEmailDemo.controlller;

import com.demos.SpringEmailDemo.dto.EmailRequestDTO;
import com.demos.SpringEmailDemo.dto.EmailResponseDTO;
import com.demos.SpringEmailDemo.service.EmailSenderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/send")
    public ResponseEntity<EmailResponseDTO> sendEmail(@Valid @RequestBody EmailRequestDTO request) {
        emailSenderService.sendSimpleEmail(request.getTo(), request.getSubject(), request.getBody());

        EmailResponseDTO response = new EmailResponseDTO("success", "Email sent successfully to " + request.getTo());
        return ResponseEntity.ok(response);
    }
}
