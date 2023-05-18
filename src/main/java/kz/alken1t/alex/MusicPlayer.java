package kz.alken1t.alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic(Genre genre) {
        int randomNumber = (int) (Math.random() * 3);
        if (genre.equals(Genre.CLASSICAL)) {
            return "Playing: " + classicalMusic.getList().get(randomNumber);
        } else {
            return "Playing: " + rockMusic.getList().get(randomNumber);
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}