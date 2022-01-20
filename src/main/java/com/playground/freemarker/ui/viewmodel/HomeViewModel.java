package com.playground.freemarker.ui.viewmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HomeViewModel {
    @NonNull
    private String title;
}
