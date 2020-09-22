package com.iceco1a.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class Control {

    @GetMapping("/test")
    public String test(){
        return "success!";
    }
}
