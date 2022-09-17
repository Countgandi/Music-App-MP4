package com.swdhahn.com.gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.swdhahn.com.basics.Content;

public class ContentPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private Content content;
	private Color standardColor, darkerColor;
	
	
	public ContentPanel(Content content) {
		super(new BorderLayout());
		this.content = content;
		
		JPanel panel = this;
		standardColor = panel.getBackground();
		darkerColor = standardColor.darker();
		
		this.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				if(panel.contains(e.getPoint())) {
					panel.setBackground(darkerColor);
					panel.setForeground(darkerColor);
					panel.repaint();
				} else {
					panel.setBackground(standardColor);
					panel.setForeground(standardColor);
					panel.repaint();
				}
			}
		});
		
		JLabel icon = new JLabel(new ImageIcon()); // TODO: ICONS
		JLabel songName = new JLabel(content.getTitle());
		JLabel artist = new JLabel(content.getArtist());
		
		JButton favoriteButton = new JButton("Favorite");
		JButton playButton = new JButton("Play");
		
		JPanel westPanel = new JPanel();
		
		//westPanel.add(icon);
		westPanel.add(playButton);
		westPanel.add(songName);
		westPanel.add(artist);
		
		this.add(westPanel, BorderLayout.WEST);
		this.add(favoriteButton, BorderLayout.EAST);
		
	}
	
	public Content getContent() {
		return content;
	}
	
}
