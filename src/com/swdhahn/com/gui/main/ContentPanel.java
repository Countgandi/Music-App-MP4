package com.swdhahn.com.gui.main;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.swdhahn.com.basics.Content;
import com.swdhahn.com.basics.Song;

public class ContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private Content content;
	
	public ContentPanel(Content content) {
		this.content = content;
		
		JLabel icon = new JLabel(new ImageIcon()); // TODO: ICONS
		JLabel songName = new JLabel(content.getTitle());
		JLabel artist = new JLabel(content.getArtist());
		
		JButton favoriteButton = new JButton("Favorite");
		
		// this.add(icon);
		this.add(songName);
		this.add(artist);
		this.add(favoriteButton);
		
	}
	
	public Content getContent() {
		return content;
	}
	
}
