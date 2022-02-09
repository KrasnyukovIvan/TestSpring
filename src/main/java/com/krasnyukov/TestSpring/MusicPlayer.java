package com.krasnyukov.TestSpring;

import java.util.List;

public class MusicPlayer {
    public List<Music> listMusic;
    public int volume;

    public MusicPlayer(){};
    public MusicPlayer(List<Music> list){
        this.listMusic = list;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void setMusic(List<Music> list){
        this.listMusic = list;
    }

    public void playMusic(){
        for(int i = 0; i < listMusic.size(); i++)
        System.out.println(i+1 + " song playing: " + listMusic.get(i).getSong());
    }


}
