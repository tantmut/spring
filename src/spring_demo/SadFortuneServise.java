package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneServise implements FortuneServise {
    @Override
    public String getDailyFortune() {
        return "Today is sad day";
    }
}
