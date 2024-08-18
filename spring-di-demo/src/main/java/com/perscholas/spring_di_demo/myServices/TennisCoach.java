package com.perscholas.spring_di_demo.myServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    //@Qualifier("databaseFortuneService")
    private FortuneServices fortuneService;

    public TennisCoach() {
        // this is default constructor
    }

    //@Autowired
    public TennisCoach(FortuneServices fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
