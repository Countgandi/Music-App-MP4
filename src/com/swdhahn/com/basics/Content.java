package com.swdhahn.com.basics;

import javax.swing.ImageIcon;

public abstract class Content implements Comparable<Content> {
	
	protected ImageIcon icon;
	protected String title, artist;
	protected int numberOfTimesStreamed;
	
	public abstract void play();
	
	@Override
	public int compareTo(Content o) {
		return this.numberOfTimesStreamed - o.numberOfTimesStreamed;
	}
	
	public String toString() {
		return title + " by " + artist;
	}
	
	public boolean equals(Content content) {
		return this.title.equals(content.getTitle()) && 
				this.artist.equals(content.getArtist()) && 
				this.getNumberOfTimesStreamed() == content.getNumberOfTimesStreamed();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTimesStreamed() {
		return numberOfTimesStreamed;
	}

	public void setNumberOfTimesStreamed(int numberOfTimesStreamed) {
		this.numberOfTimesStreamed = numberOfTimesStreamed;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

}
