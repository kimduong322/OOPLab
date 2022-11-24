package test.store;
import aims.disc.DigitalVideoDisc;
import aims.store.store;

public class StoreTest {

	public static void main(String[] args) {
		// create a store
		store store1 = new store();
		
		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store1.addDVD(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		store1.addDVD(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store1.addDVD(dvd3);
		
		// show available dvd in store before remove dvd1
		store1.availableDVD();
		
		// removeDVD1
		store1.removeDVD(dvd1);
		
		// show  available dvd in store after remove dvd1
		store1.availableDVD();
	}

}
