package com.perscholas.spring_di_demo.myServices;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneServices implements FortuneServices{
    @Override
    public String getFortune() {
        return null;
    }
}