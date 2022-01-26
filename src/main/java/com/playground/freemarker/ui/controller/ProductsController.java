package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.model.AnchorModel;
import com.playground.freemarker.ui.viewmodel.ProductsViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ProductsController {

    @GetMapping("/products")
    public String getTemplateName(Model model) {

        ArrayList<AnchorModel> anchorModels = new ArrayList<>();

        anchorModels.add(new AnchorModel("Home", "/home", null, "breadcrumb"));
        anchorModels.add(new AnchorModel("Products", "/products", null, "breadcrumb"));

        model.addAttribute("vm", new ProductsViewModel("Products", anchorModels));

        return "/screens/products/ProductsScreen";
    }
}
