package spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_demo.Coach;
import spring_demo.FortuneServise;
import spring_demo.SadFortuneServise;
import spring_demo.SwimCoach;

@Configuration
public class SwimConfig {

    @Bean
    public FortuneServise sadFortuneServise() {
        return new SadFortuneServise();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneServise());
    }
}
