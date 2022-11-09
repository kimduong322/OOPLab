
public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// Begin
		System.out.println("Begin");
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.displayCart();

		// Remove dvd2
		System.out.println("Remove dvd2");
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.displayCart();
		
		// Add dvd2
		System.out.println("Add dvd2");
		anOrder.addDigitalVideoDisc(dvd2);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		anOrder.displayCart();
	}

}
