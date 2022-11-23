public class TestPassingParameter {

	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTiltle(); 
		dvd1.setTiltle(dvd2.getTiltle());
		dvd2.setTiltle(tmp);
	}
	
	public static void main(String[] arg) {
		// create dvd1, dvd1
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		
		// before swapping
		System.out.println("Before swapping: ");
		System.out.println("Title of dvd1: " + dvd1.getTiltle());
		System.out.println("Title of dvd2: " + dvd2.getTiltle());
		
		// Swap
		swap(dvd1, dvd2);
		
		// afer swapping
		System.out.println("After swapping: ");
		System.out.println("Title of dvd1: " + dvd1.getTiltle());
		System.out.println("Title of dvd2: " + dvd2.getTiltle());

	}
}


