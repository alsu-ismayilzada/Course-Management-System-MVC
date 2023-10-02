package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final TeacherService teacherService;
    private final ServiceService serviceService;
    private final CourseService courseService;
    private final EventService eventService;
    private final StudentService studentService;
    @GetMapping
    public String admin(){
        return "admin";
    }

    @GetMapping( "/teachers")
    public ModelAndView teachers(){
        ModelAndView modelAndView = new ModelAndView("teachers");
        modelAndView.addObject("teachers",teacherService.getAll());
        modelAndView.addObject("teacherRequest",new Teacher());
        return modelAndView;
    }

    @PostMapping( "/teachers/edit")
    public RedirectView teachersEditPost(@ModelAttribute Teacher teacher) {
        teacherService.addTeacher(teacher);
        return new RedirectView("/admin/teachers");
    }
    @GetMapping( "/teachers/edit/{id}")
    public ModelAndView teachersEdit(@PathVariable("id") Integer id){
        Teacher teacher = teacherService.getById(id);
        ModelAndView modelAndView = new ModelAndView("teachers");
        modelAndView.addObject("teachers", teacher);
        return modelAndView;
    }

    @PostMapping("/teachers/delete/{id}")
    public RedirectView teachersDeletePost(@PathVariable("id") Integer id){
        teacherService.deleteById(id);
        return new RedirectView("/admin/teachers");
    }

    @GetMapping( "/services")
    public ModelAndView services(){
        ModelAndView modelAndView = new ModelAndView("services");
        modelAndView.addObject("services",serviceService.getAll());
        modelAndView.addObject("serviceRequest",new Service());
        return modelAndView;
    }
    @GetMapping( "/services/edit/{id}")
    public ModelAndView servicesEdit(@PathVariable("id") Integer id){
        Service service = serviceService.getById(id);
        ModelAndView modelAndView = new ModelAndView("services");
        modelAndView.addObject("service", service);
        return modelAndView;
    }

    @PostMapping( "/services/edit")
    public RedirectView servicesEditPost(@ModelAttribute Service service){
        serviceService.addService(service);
        return new RedirectView("/admin/services");
    }

    @PostMapping("/services/delete/{id}")
    public RedirectView servicesDeletePost(@PathVariable("id") Integer id){
        serviceService.deleteById(id);
        return new RedirectView("/admin/services");
    }
    @GetMapping( "/events")
    public ModelAndView events(){
        ModelAndView modelAndView = new ModelAndView("events");
        modelAndView.addObject("events",eventService.getAll());
        modelAndView.addObject("eventsRequest",new Event());
        return modelAndView;
    }
    @GetMapping( "/events/edit/{id}")
    public ModelAndView eventsEdit(@PathVariable("id") Integer id){
        Event event = eventService.getById(id);
        ModelAndView modelAndView = new ModelAndView("events");
        modelAndView.addObject("events", event);
        return modelAndView;
    }

    @PostMapping( "/events/edit")
    public RedirectView eventsEditPost(@ModelAttribute Event event){
        eventService.addEvent(event);
        return new RedirectView("/admin/events");
    }

    @PostMapping("/events/delete/{id}")
    public RedirectView eventsDeletePost(@PathVariable("id") Integer id){
        eventService.deleteById(id);
        return new RedirectView("/admin/events");
    }
    @GetMapping( "/courses")
    public ModelAndView courses(){
        ModelAndView modelAndView = new ModelAndView("courses");
        modelAndView.addObject("courses",courseService.getAll());
        modelAndView.addObject("courseRequest",new Course());
        return modelAndView;
    }
    @GetMapping( "/courses/edit/{id}")
    public ModelAndView coursesEdit(@PathVariable("id") Integer id){
        Course course = courseService.getById(id);
        ModelAndView modelAndView = new ModelAndView("courses");
        modelAndView.addObject("service", course);
        return modelAndView;
    }

    @PostMapping( "/courses/edit")
    public RedirectView coursesEditPost(@ModelAttribute Course course){
        courseService.addCourse(course);
        return new RedirectView("/admin/courses");
    }

    @PostMapping("/courses/delete/{id}")
    public RedirectView coursesDeletePost(@PathVariable("id") Integer id){
        courseService.deleteById(id);
        return new RedirectView("/admin/courses");
    }
    @GetMapping( "/students")
    public ModelAndView students(){
        ModelAndView modelAndView = new ModelAndView("students");
        modelAndView.addObject("students",studentService.getAll());
        modelAndView.addObject("studentRequest",new Student());
        return modelAndView;
    }
    @GetMapping( "/students/edit/{id}")
    public ModelAndView studentsEdit(@PathVariable("id") Integer id){
        Student student = studentService.getById(id);
        ModelAndView modelAndView = new ModelAndView("students");
        modelAndView.addObject("students", student);
        return modelAndView;
    }

    @PostMapping( "/students/edit")
    public RedirectView studentsEditPost(@ModelAttribute Student student){
        studentService.add(student);
        return new RedirectView("/admin/students");
    }

    @PostMapping("/students/delete/{id}")
    public RedirectView studentsDeletePost(@PathVariable("id") Integer id){
        studentService.deleteById(id);
        return new RedirectView("/admin/students");
    }

}
