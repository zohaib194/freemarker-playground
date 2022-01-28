package com.playground.freemarker.ui.controller;

import com.playground.freemarker.ui.model.AnchorModel;
import com.playground.freemarker.ui.model.ProductAnchorModel;
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

        anchorModels.add(new AnchorModel("Home", "/home", null, "-breadcrumb", ""));
        anchorModels.add(new AnchorModel("Products", "/products", null, "-breadcrumb", "page"));

        ArrayList<ProductAnchorModel> productAnchorModels = new ArrayList<>();
        productAnchorModels.add(new ProductAnchorModel(new AnchorModel("LG", "/products#lg", null, "-product", ""), "https://1000logos.net/wp-content/uploads/2017/03/LG-Logo-1995.jpg"));
        productAnchorModels.add(new ProductAnchorModel(new AnchorModel("Nokia", "/products#nokia", null, "-product", ""), "https://1000logos.net/wp-content/uploads/2018/08/Nokia-logo-768x432.jpg"));
        productAnchorModels.add(new ProductAnchorModel(new AnchorModel("Apple", "/products/apple", null, "-product", ""), "https://1000logos.net/wp-content/uploads/2018/08/Apple-logo-768x432.jpg"));
        productAnchorModels.add(new ProductAnchorModel(new AnchorModel("Samsung", "/products/samsung", null, "-product", ""), "https://1000logos.net/wp-content/uploads/2018/08/Samsung-logo-768x432.jpg"));
        productAnchorModels.add(new ProductAnchorModel(new AnchorModel("Huawei", "/products/huawei", null, "-product", ""), "https://1000logos.net/wp-content/uploads/2018/08/Huawei-logo-768x432.jpg"));

        model.addAttribute("vm", new ProductsViewModel("Products", anchorModels, productAnchorModels));

        return "/screens/products/ProductsScreen";
    }
}
