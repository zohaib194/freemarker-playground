package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import com.playground.freemarker.ui.viewmodel.TopicsViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopicsController {

    @GetMapping("/topics")
    public String getTemplateName(Model model) {

        model.addAttribute("vm", new TopicsViewModel("Topics"));

        return "/screens/topics/TopicsScreen";
    }
}
