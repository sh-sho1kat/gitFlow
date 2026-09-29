package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

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
    @PutMapping("edit/{id}")
    public String edit(@PathVariable String id, @RequestBody String post) {
        return "post";
    }
}
