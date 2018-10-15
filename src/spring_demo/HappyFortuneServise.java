package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServise implements FortuneServise {
    @Override
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
