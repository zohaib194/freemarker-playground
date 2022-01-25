package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.AboutViewModel;
import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String getTemplateName(Model model) {

        model.addAttribute("vm", new AboutViewModel("About"));

        return "/screens/about/AboutScreen";
    }
}
