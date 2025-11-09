package com.software.TPE.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter

public class New {
    private String id;
    private String title;
    private String content;
    private Boolean state;
    private String imagenUrl;

}
