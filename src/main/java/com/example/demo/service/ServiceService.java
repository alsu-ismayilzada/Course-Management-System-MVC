package com.example.demo.service;



import com.example.demo.entity.Service;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface ServiceService {

    void addService(Service service);
    void deleteById(int id);
    Service getById(Integer id);
    List<Service> getAll();
}
