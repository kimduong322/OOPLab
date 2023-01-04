package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Disc extends Media {
	private String director;
	private int length;
	
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.setDirector(director);
		this.setLength(length);
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void play() throws PlayerException {
		// TODO Auto-generated method stub
		
	}
	
}
