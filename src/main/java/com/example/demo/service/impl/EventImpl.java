package com.example.demo.service.impl;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;
import com.example.demo.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventImpl implements EventService {

    private final EventRepository eventRepository;
    @Override
    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void deleteById(int id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event getById(int id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
}
