package com.krasnyukov.TestSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpringApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		musicPlayer.playMusic();

		System.out.println(musicPlayer.getVolume());

		musicPlayer.setVolume(100);

		System.out.println(musicPlayer.getVolume());

		context.close();
	}

}
