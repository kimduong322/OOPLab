package aims.cart;
import java.util.*;
import aims.media.*;

public class Cart {
	private List<Media> itemsOrdered = new ArrayList<Media>();
	public static final int MAX_NUMBERS_ORDERED = 20;
	public Cart() {
		super();
	}
	public double totalCost() {
		double sum = 0.0;
		for(Media x: itemsOrdered) {
			sum += x.getCost();
		}
		return sum;
	}
	public void displayCart() {
		if(itemsOrdered.size()!=0) {
			int i = 0;
			for(Media x: itemsOrdered) {
				System.out.printf("%d. ", ++i);
				x.printDetail();
			}
		}
		else {
			System.out.println("Cart is empty!");
		}
		
		System.out.println("Total cost: " + totalCost() + "\n\n");
	}
	
	public int addMedia(Media x) {
		if(itemsOrdered.size() + 1 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(x);
			return 1;
		}
		else return -1;
	}
	
	public int removeMedia(Media x) {
		if(itemsOrdered.contains(x)) {
			itemsOrdered.remove(x);
			return 1;
		}
		else return -1;
	}
}
