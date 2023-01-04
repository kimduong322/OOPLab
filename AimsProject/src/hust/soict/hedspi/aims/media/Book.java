package hust.soict.hedspi.aims.media;
import java.util.*;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public Book(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) throws Exception{
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}
		else {
			throw new Exception("That author is not listed!");
		}
	}
	@Override
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		
	}
}
