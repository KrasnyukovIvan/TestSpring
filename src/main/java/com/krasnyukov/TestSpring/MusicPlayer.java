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


    public void playMusic(MusicType type){
        switch(type){
            case CLASSIC:
                System.out.println("playing classic song: " + firstMusic.getSong());
                break;
            case ROCK:
                System.out.println("playing rock song: " + secondMusic.getSong());
                break;
            default:
                System.out.println("Wrong music type");
        }
    }


}
