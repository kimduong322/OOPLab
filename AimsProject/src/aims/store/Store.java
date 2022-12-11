package aims.store;
import java.util.ArrayList;
import java.util.List;

import aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();

	public Store() {
		super();
	}
	public List<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void addMedia(Media x) {
		itemsInStore.add(x);
	}	
	public void removeMedia(Media x) {
		if(itemsInStore.contains(x)) {
			itemsInStore.remove(x);
		}
	}
	
	public void available() {
		for(Media x: itemsInStore) {
			x.printDetail();
		}
	}
	
	public Media searchByTitle(String title) {
		for(Media x: itemsInStore) {
			int c = x.getTitle().compareTo(title);
			if(c==0) return x;
		}
		return null;
	}
	public int size() {
		return itemsInStore.size();
	}
}
