package com.swdhahn.com.basics;

public class Song extends Content {
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println("Now playing song: " + this.toString());
	}

}
