package com.swdhahn.com.gui.main;

import java.util.ArrayList;

import javax.swing.JPanel;

import com.swdhahn.com.basics.Content;
import com.swdhahn.com.basics.Song;

public class MainView extends JPanel {
	private static final long serialVersionUID = 1L;

	private PlaylistView playlistView;
	
	public MainView() {
		playlistView = new PlaylistView();
		
		
		ArrayList<Content> songs = new ArrayList<Content>();
		songs.add(new Song("Get Down", "James Brown"));
		songs.add(new Song("Fly me to the Moon", "Frank Sinatra"));
		songs.add(new Song("Ain't No Mountain High Enough", "Marvin Gaye"));
		songs.add(new Song("Rocket Man", "Elton John"));
		
		playlistView.updateSongs(songs);

		this.add(playlistView);

		
	}
	
}
