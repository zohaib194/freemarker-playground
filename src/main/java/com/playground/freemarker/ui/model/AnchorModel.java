package com.playground.freemarker.ui.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnchorModel {
    @NonNull
    private String text;
    @NonNull
    private String href;
    @Nullable
    private String target;
    @Nullable
    private String scssClass;
    @Nullable
    private String ariaCurrent;
}
