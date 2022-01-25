package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductsController {

    @GetMapping("/products")
    public String products(Model model) {

        model.addAttribute("vm", new ProductsViewModel("Products"));

        return "/screens/products/ProductsScreen";
    }
}
