package com.example.myproject.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
//@Scope("prototype")
public class A {
    @Autowired
    private B b;


}
