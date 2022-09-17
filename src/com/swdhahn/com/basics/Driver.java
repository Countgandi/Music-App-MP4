package com.swdhahn.com.basics;

import java.util.Scanner;

public class Driver {
	
	public static boolean handleInput(int input) {
		switch(input) {
		case 1:
			// Create a listener account
			
			break;
		case 2:
			// List all Playlists and Albums and their contents
			
			
			break;
		case 3:
			// Add songs to an existing playlist
			
			break;
		case 4:
			// Shuffle an existing Playlist or listen to an Album
			
			break;
		case 5:
			// Add a song or podcast to favorites
			
			break;
		case 6:
			// Export all of a listener’s favorites out to a file in ascending order by times streamed
			
			break;
		case 7:
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		/*
		 * Create a listener account
		 * List all Playlists and Albums and their contents
		 * Add songs to an existing playlist
		 * Shuffle an existing Playlist or listen to an Album
		 * Add a song or podcast to favorites
		 * Export all of a listener’s favorites out to a file in ascending order by times streamed
		 * Exit
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Create a listener account\n"
				+ "2. List all Playlists and Albums and their contents\n"
				+ "3. Add songs to an existing playlist\n"
				+ "4. Shuffle an existing Playlist or listen to an Album\n"
				+ "5. Add a song or podcast to favorites\n"
				+ "6. Export all of a listener's favorites out to a file in ascending order by times streamed\n"
				+ "7. Exit");
		
		while(true) {
			if(handleInput(s.nextInt())) {
				break;
			}
		}
		
		s.close();
		
	}

}
