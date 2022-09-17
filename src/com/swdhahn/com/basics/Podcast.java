package com.swdhahn.com.basics;

public class Podcast extends Content {
	
	private int episodeNumber;
	
	public Podcast(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	@Override
	public void play() {
		System.out.println("Now playing podcast: " + this.toString() + " - Episode: " + this.episodeNumber);
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

}
