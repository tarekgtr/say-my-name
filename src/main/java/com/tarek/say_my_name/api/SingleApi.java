package com.tarek.say_my_name.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleApi {

    @GetMapping("/")
    public String getMyName() {
        return "Tarek Goufa GTR SKYLINE";
    }
}
