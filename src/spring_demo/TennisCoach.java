package spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneServise")
    private FortuneServise fortuneServise;
//
//    @Autowired
//    public TennisCoach(FortuneServise fortuneServise){
//        this.fortuneServise = fortuneServise;
//    }

    public TennisCoach(){
        System.out.println("Inside default constructor");
    }

//    @Autowired
//    public void setFortuneServise(FortuneServise fortuneServise){
//        System.out.println("Inside setFortuneServise");
//        this.fortuneServise = fortuneServise;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practise more every day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServise.getDailyFortune();
    }
}
