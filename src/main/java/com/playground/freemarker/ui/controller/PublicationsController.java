package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import com.playground.freemarker.ui.viewmodel.PublicationsViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicationsController {
    @GetMapping("/publications")
    public String getTemplateName(Model model) {

        model.addAttribute("vm", new PublicationsViewModel("Publications"));

        return "/screens/publications/PublicationsScreen";
    }
}
