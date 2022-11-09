
public class Cart {
	
	private int qtyOrdered = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc has been added!");
		}
		else {
			System.out.println("The cart is almost full!");
		}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; ++i) {
			
			if(itemsOrdered[i] == disc) {
				
				for(int j = i; j < qtyOrdered; ++j) {
					itemsOrdered[j] = itemsOrdered[j+1];
					
					if(j == qtyOrdered-1) {
						itemsOrdered[j] = null;
					}
				}
			qtyOrdered --;
			break;
			}
		}
	}
	
	public double totalCost() {
		double sum = 0.0;
		
		for(int i = 0; i < qtyOrdered; ++i) {
			sum += itemsOrdered[i].getCost();
		}
		
		return sum;
	}
	
	
	public void displayCart() {
		if(qtyOrdered != 0) {
			for(int i = 0; i < qtyOrdered; ++i) {
				itemsOrdered[i].printDetail();
			}
		}
		else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}
	}
	
}
