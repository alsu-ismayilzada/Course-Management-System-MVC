package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/contact")
public class ContactController {

    private final ContactService contactService;
    @PostMapping
    public RedirectView add(@ModelAttribute Contact contact){
        contactService.add(contact);
        return new RedirectView("/?success");
    }
}
