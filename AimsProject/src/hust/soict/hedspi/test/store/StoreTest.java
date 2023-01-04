package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// create a store
		Store store1 = new Store();
		
		// Create new dvd objects and add them to the store
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//		store1.addMedia(dvd1);
		
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
//		store1.addMedia(dvd2);
		
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//		store1.addMedia(dvd3);
		
		// show available dvd in store before remove dvd1
//		store1.available();
		
		// removeDVD1
//		store1.removeMedia(dvd1);
		
		// show  available dvd in store after remove dvd1
		store1.available();
	}

}
