package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @PostMapping("addpost")
    public String post(@RequestBody String post) {
        return "post";
    }

    @GetMapping("getpost")
    public String getpost(@RequestBody String post) {
        return post;
    }
}
