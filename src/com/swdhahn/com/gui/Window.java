package com.swdhahn.com.gui;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.swdhahn.com.gui.main.MainView;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	

	public Window(int width, int height, String title) {
		super(title);
		
		Dimension size = new Dimension(width, height);
		this.setMinimumSize(size);
		this.setPreferredSize(size);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		
		panel = new JPanel(new CardLayout());
		this.add(panel);
		
		addItems();
		
		this.setVisible(true);
		
	}
	
	private void addItems() {
		panel.add(new MainView(), "MainMenu");
		
	}

}
