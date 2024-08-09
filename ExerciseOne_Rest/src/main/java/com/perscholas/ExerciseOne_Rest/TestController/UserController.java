package com.perscholas.ExerciseOne_Rest.TestController;

import com.perscholas.ExerciseOne_Rest.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @PostMapping("/users")
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:" + user);
    }
}
