package com.playground.freemarker.ui.viewmodel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeViewModel extends MainLayoutViewModel{
    private String title;

    public HomeViewModel(String title) {
        super(title);
        this.title = title;
    }
}
