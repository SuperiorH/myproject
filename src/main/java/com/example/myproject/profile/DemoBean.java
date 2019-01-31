package com.example.myproject.profile;

import lombok.Data;

@Data
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        this.content = content;
    }
}
