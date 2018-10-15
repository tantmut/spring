package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    private FortuneServise fortuneServise;

    public SwimCoach (FortuneServise fortuneServise){
        this.fortuneServise = fortuneServise;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServise.getDailyFortune();
    }
}
