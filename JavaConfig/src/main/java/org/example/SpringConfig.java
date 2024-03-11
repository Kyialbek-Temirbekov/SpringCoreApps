package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }
    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(classicalMusic());
        musicList.add(jazzMusic());
        return musicList;
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
    @Bean Computer computer() {
        return new Computer(musicPlayer());
    }
}
