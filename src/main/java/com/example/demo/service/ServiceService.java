package com.example.demo.service;



import com.example.demo.entity.Service;

import java.util.List;

public interface ServiceService {

    void addService(Service service);
    void deleteById(int id);
    Service getById(int id);
    List<Service> getAll();
}
