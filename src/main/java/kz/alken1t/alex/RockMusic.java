package kz.alken1t.alex;

import kz.alken1t.alex.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> list = new ArrayList<>();

    {
        list.add("We Sell The Dead");
        list.add("Train Of Pain");
        list.add("Train Of Pain");
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}