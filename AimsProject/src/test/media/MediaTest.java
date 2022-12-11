package test.media;

import java.util.ArrayList;
import java.util.List;

import aims.media.Book;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

/**
 * MediaTest is class for Polymorphism with toString() method demo
 * **/
public class MediaTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		Book book = new Book(1,"The Lion King","Animation",19.95f);
		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		mediae.add(dvd);
		mediae.add(book);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
	}

}
