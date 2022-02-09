package com.krasnyukov.TestSpring;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> songs = Arrays.asList("AC/DC", "Choi", "Queen");
    @Override
    public String getSong() {
        Random rand = new Random();
        return songs.get(rand.nextInt(songs.size()));
    }
}
