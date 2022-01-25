package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import com.playground.freemarker.ui.viewmodel.ServicesViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicesController {

    @GetMapping("/services")
    public String getTemplateName(Model model) {

        model.addAttribute("vm", new ServicesViewModel("Services"));

        return "/screens/services/ServicesScreen";
    }
}
