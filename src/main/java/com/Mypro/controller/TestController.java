package com.Mypro.controller;


import com.Mypro.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/TestController")
public class TestController {


    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("SpringWeb")Customer emp, ModelMap model) {
        model.addAttribute("ID", emp.getFirstname());
        model.addAttribute("name", emp.getLastname());
        model.addAttribute("salary", emp.getAddress());

        return "Employee";
    }


}
