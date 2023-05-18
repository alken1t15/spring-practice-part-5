package kz.alken1t.alex;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private final List<String> list = new ArrayList<>();

    {
        list.add("Hungarian Rhapsody");
        list.add("Cinematic Time Lapse");
        list.add("Ancient Wind");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Dong my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}