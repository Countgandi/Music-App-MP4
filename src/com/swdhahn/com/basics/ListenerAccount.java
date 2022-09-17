package com.swdhahn.com.basics;

import java.util.ArrayList;

public class ListenerAccount extends Account {

	private ArrayList<Content> contents, favorites;
	
	public ListenerAccount() {
		contents = new ArrayList<Content>();
		favorites = new ArrayList<Content>();
	}
	
	/**
	 * Favorites a piece of content
	 * 
	 * @param content - the content to be favorited
	 */
	public void favorite(Content content) {
		boolean flag = true;
		for(int i = 0; i < favorites.size(); i++) {
			if(favorites.get(i).equals(content)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			favorites.add(content);
		}
	}

	public ArrayList<Content> getContents() {
		return contents;
	}

	public void setContents(ArrayList<Content> contents) {
		this.contents = contents;
	}

	public ArrayList<Content> getFavorites() {
		return favorites;
	}

	public void setFavorites(ArrayList<Content> favorites) {
		this.favorites = favorites;
	}
	
}
