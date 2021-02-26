package com.example.midTermWebApp.JokesController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    @RequestMapping("/joke")
    public String joke()
    {
        return "Jokes";
    }

}
