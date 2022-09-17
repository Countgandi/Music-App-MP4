package com.swdhahn.com.gui.main;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.swdhahn.com.basics.Content;

public class PlaylistView extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Content> content;

	public PlaylistView() {
		super(new GridLayout(0, 1));
		
		
	}
	
	public void updateSongs(ArrayList<Content> content) {
		this.content = content;
		this.removeAll();
		for(int i = 0; i < content.size(); i++) {
			ContentPanel c = new ContentPanel(content.get(i));
			c.setAlignmentX(Component.LEFT_ALIGNMENT);
			this.add(c);
		}
	}
	
}
