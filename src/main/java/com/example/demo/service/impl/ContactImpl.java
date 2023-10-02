package com.example.demo.service.impl;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class ContactImpl implements ContactService {

    ContactRepository repository;

    @Override
    public void add(Contact contact) {
        repository.save(contact);
        log.info("{} entity inserted to database", contact);
    }
}
