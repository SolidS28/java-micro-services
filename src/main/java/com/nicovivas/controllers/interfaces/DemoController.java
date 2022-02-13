package com.nicovivas.controllers.interfaces;

import org.springframework.web.bind.annotation.GetMapping;

public interface DemoController {
    @GetMapping("/ping")
    String ping();
}
