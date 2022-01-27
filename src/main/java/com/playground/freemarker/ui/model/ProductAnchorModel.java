package com.playground.freemarker.ui.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductAnchorModel {
    @NonNull
    private AnchorModel anchor;
    @NonNull
    private String imageSource;
}
