
public class CartTest {

	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();
		
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		
		// Test the displayCart method
		cart.displayCart();
		
		// Test search() by title
		System.out.println("\nTest search() by title");
		cart.search("a"); // => dvd2, dvd3 
		cart.search("the lion"); // dvd1
		cart.search("THE LION"); // dvd1
		cart.search("The WAR");  // not found
		
		
		// Test serch() by id
		System.out.println("\nTest search() by title");
		cart.search(3); // dvd3
		cart.search(4); // not found
	}

}
