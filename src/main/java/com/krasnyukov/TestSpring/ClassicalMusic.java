package com.krasnyukov.TestSpring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = Arrays.asList("Vivldi", "Ludovica", "Bah");
    @Override
    public String getSong(){
        Random rand = new Random();
        return songs.get(rand.nextInt(songs.size()));
    }
}
