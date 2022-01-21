package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.HomeViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        // View model attribute
        model.addAttribute("vm", new HomeViewModel("Home"));

        return "/screens/home/HomeScreen"; // name of the template
    }
}
