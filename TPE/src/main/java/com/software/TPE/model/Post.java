package com.software.TPE.model;

import lombok.Generated;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter

public class Post {
    @Id
    private UUID id;
    private String title;
    private String content;
    private Boolean state;
    private String category;
    private String imageUrl;


}
