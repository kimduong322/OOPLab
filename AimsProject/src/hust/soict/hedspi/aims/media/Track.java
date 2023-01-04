package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable{
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() throws PlayerException{
		if(this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: "+ this.getLength());
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}
	public boolean equals(Object obj) {
		Track o = (Track)obj;
		return o.getLength()==this.getLength() && this.getTitle().equals(o.getTitle());
	}
}
