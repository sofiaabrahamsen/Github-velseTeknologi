package com.example.githubactionovelsetek;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/cam")
    public String cam(){
        return "camellaHTML";
    }


    @GetMapping("/mathias")
    public String mathias(){
        return "matt";
    }

}
