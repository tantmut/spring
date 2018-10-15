package spring_demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneServise implements FortuneServise {

    String[] list = {
            "It's your best day",
            "You win the game",
            "Up to you"
    };

    Random random = new Random();
    @Override
    public String getDailyFortune() {

        int it = random.nextInt(list.length);
        return list[it];
    }
}
