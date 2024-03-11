package org.example;

import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer(){}
    public MusicPlayer(Music music) { this.music = music; }
    public void setMusic(Music music) { this.music = music; }
    public Music getMusic() {
        return music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
