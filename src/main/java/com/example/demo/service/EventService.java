package com.example.demo.service;

import com.example.demo.entity.Event;

import java.util.List;

public interface EventService {

    void addEvent(Event event);
    void deleteById(int id);
    Event getById(int id);
    List<Event> getAll();
}
