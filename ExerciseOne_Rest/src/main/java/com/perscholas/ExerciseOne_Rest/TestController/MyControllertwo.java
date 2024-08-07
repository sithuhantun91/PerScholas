package com.perscholas.ExerciseOne_Rest.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyControllertwo {
    @GetMapping({"login"})
    public String showIndex() {
        return "index";
    }
}
