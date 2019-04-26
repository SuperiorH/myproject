package com.example.myproject.configuration;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
//@Scope("prototype")
public class C {
//    @Autowired
    private A a;


}
