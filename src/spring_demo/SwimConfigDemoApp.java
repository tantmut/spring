package spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "spring_demo.SwimConfig.class");
        Coach theCoach = context.getBean("swimCoach",Coach.class);

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
