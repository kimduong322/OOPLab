package aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media m1, Media m2) {
		int c = m1.getTitle().compareTo(m2.getTitle());
		if(c == 0) {
			if(m1.getCost() < m2.getCost()) c = -1;
			else if(m1.getCost() > m2.getCost()) c = 1;
		}
		return c;
	}

}
