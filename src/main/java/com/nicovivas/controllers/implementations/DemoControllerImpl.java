package com.nicovivas.controllers.implementations;

import com.nicovivas.controllers.interfaces.DemoController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerImpl implements DemoController {

    @Override
    public String ping() {
        return "pong";
    }
}
