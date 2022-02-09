package com.krasnyukov.TestSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    public Music firstMusic;
    public Music secondMusic;
    public int volume;

    public MusicPlayer(){};

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic")Music firstMusic,@Qualifier("rockMusic")Music secondMusic){
        this.firstMusic = firstMusic;
        this.secondMusic = secondMusic;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }


    public void playMusic(){
        System.out.println("1) song playing: " + firstMusic.getSong());
        System.out.println("2) song playing: " + secondMusic.getSong());
    }


}
