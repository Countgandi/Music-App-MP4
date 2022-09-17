package com.swdhahn.com;

import com.swdhahn.com.gui.Window;

public class Client {

	private Window window;
	
	public Client() {
		
		window = new Window(1280, 720, "Music App");
		
	}
	
	public static void main(String[] args) {
		new Client();
		
		
		
	}

}
