package com.hotelbooking.controller; // ✅ change if needed

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "register"; // ✅ loads register.html
    }
}
