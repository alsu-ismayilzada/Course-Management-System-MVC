package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.EventRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class GeneralController {

    private final TeacherService teacherService;
    private final EventService eventService;
    private final CourseService courseService;
    private final ServiceService serviceService;
    private final StudentService studentService;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView homePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("teachers",teacherService.getAll());
        modelAndView.addObject("events",eventService.getAll());
        modelAndView.addObject("courses",courseService.getAll());
        modelAndView.addObject("services",serviceService.getAll());
        modelAndView.addObject("students",studentService.getAll());
        modelAndView.addObject("contact",new Contact());;
        return modelAndView;
    }


}
