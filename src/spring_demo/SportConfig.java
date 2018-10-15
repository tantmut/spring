package spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import spring_demo.Coach;
import spring_demo.TennisCoach;

@Configuration
@ComponentScan("spring_demo")
public class SportConfig {
}
