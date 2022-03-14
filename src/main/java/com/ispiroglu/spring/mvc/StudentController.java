package com.ispiroglu.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    public String showForm(Model theModel)
    {
        // create a new student obj
        Student theStudent = new Student();
        // add student object to the model as attribute.
        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
}