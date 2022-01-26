package com.playground.freemarker.ui.viewmodel;

import com.playground.freemarker.ui.model.AnchorModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class ProductsViewModel {
    private String title;
    private ArrayList<AnchorModel> breadcrumbs;
}
