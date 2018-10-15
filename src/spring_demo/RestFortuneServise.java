package spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneServise implements FortuneServise {
    @Override
    public String getDailyFortune() {
        return null;
    }
}
