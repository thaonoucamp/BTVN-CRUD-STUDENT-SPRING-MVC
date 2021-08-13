package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/list")
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/list.jsp");
         List<Student>list = studentService.findAll();
        modelAndView.addObject("list", list);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showFormCreate(@ModelAttribute("student") Student student){
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/create.jsp");
        return modelAndView;
    }
    @PostMapping ("/create")
    public ModelAndView create(@ModelAttribute("student") Student student){
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/list.jsp");
        studentService.creat(student);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @GetMapping("/edit/{name}")
    public ModelAndView showFormEdit(@PathVariable String name){
        Student student1 = studentService.findByName(name);
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/view.jsp");
        modelAndView.addObject("student", student1);
        return modelAndView;
    }

    @PutMapping("/edit/{name}")
    public ModelAndView edit(@PathVariable String name, @ModelAttribute Student student){
       Student student1 = studentService.findByName(name);
        student.setId(student1.getId());
        if (student.getName() == ""){
            student.setName(student1.getName());
        }
        if (student.getDateOfBirth().equals("")){
            student.setDateOfBirth(student1.getDateOfBirth());
        }
        if (student.getAddress() == ""){
            student.setAddress(student1.getAddress());
        }
        if (student.getPhoneNumber() == ""){
            student.setPhoneNumber(student1.getPhoneNumber());
        }
        if (student.getEmail() == ""){
            student.setEmail(student1.getEmail());
        }
        if (student.getClassRoom() == ""){
            student.setClassRoom(student1.getClassRoom());
        }
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/edit.jsp");
        modelAndView.addObject("student",student);
        return modelAndView;
    }

    @GetMapping("/delete/{name}")
    public ModelAndView showFormDelete(@PathVariable String name){
        Student student = studentService.findByName(name);
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/views/student/view.jsp");
        return modelAndView;
    }

    @DeleteMapping("/delete/{name}")
    public String delete(@PathVariable String name){
        studentService.delete(studentService.findByName(name).getId());
        return "redirect:/WEB-INF/views/student/list.jsp";
    }
}
