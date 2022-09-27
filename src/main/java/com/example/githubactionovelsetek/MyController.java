package com.example.githubactionovelsetek;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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

    @GetMapping("/Barkistan")
    public String oliver(){
        return "Barkistan";
    }

    @GetMapping("/lasse")
    public String lasse() {
        return "Lasse";
    }
    }


