package com.example.demo.service.impl;

import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;
import com.example.demo.service.ServiceService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Override
    public void addService(Service service) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Service getById(int id) {
        return null;
    }

    @Override
    public List<Service> getAll() {
        return serviceRepository.findAll();
    }
}
