import java.util.ArrayList;
import java.util.Iterator;

public class store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

	public store() {
		super();
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		
		// create an Iterator Object
		Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
		
		// hold true till there is single element remaining in object
		while(itr.hasNext()) {
			DigitalVideoDisc tmp = itr.next();
			
			// If equal by id, then remove
			if(tmp.getId() == dvd.getId()) {
				itr.remove();
			}
		}
	}
	
	public void availableDVD() {
		// create an Iterator Object
		Iterator<DigitalVideoDisc> itr = itemsInStore.iterator();
		
		while(itr.hasNext()) {
			DigitalVideoDisc tmp = itr.next();
			
			System.out.println(tmp.printDetail());
		}
	}
}
