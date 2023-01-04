package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {
		int c;
		if(o1.getCost() < o2.getCost()) c = -1;
		else if(o1.getCost() > o2.getCost()) c = 1;
		else c = 0;
		if(c == 0) {
			c = o1.getTitle().compareTo(o2.getTitle());
		}
		return c;
	}

}
