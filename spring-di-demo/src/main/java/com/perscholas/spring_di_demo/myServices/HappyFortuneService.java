package com.perscholas.spring_di_demo.myServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
