package hust.soict.hedspi.aims.cart;

import javax.naming.LimitExceededException;

import hust.soict.hedspi.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
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
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
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
	
	public void addMedia(Media x) throws LimitExceededException {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(x);
		}
		else {
			throw new LimitExceededException("ERROR: The number of media has reached its limit");
		}
	}
	
	public int removeMedia(Media x) {
		if(itemsOrdered.contains(x)) {
			itemsOrdered.remove(x);
			return 1;
		}
		else return -1;
	}
}
