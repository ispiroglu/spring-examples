package com.ispiroglu.spring.mvc.basicControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel)
    {
        // create a new student obj
        Student theStudent = new Student();
        // add student object to the model as attribute.
        theModel.addAttribute("student", theStudent);

        theModel.addAttribute("countryOptions", countryOptions);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent)
    {

        return "student-confirmation";
    }
}
