package com.nicovivas.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public interface DemoController {
    /**
     * Just a simple static response
     * @return "pong"
     */
    @GetMapping("/ping")
    String ping();
}
