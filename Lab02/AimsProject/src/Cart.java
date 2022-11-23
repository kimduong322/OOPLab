
public class Cart {


	private int qtyOrdered = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public Cart() {
		super();
	}
	
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
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		for(int i = 0; i < dvdlist.length; ++i) {
			addDigitalVideoDisc(dvdlist[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
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
		System.out.println("*******************************************CART*********************************************************");
		
		if(qtyOrdered != 0) {
			for(int i = 0; i < qtyOrdered; ++i) {
				System.out.println((i+1)+". DVD "+itemsOrdered[i].printDetail());
			}
		}
		else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}
		
		System.out.println("Total cost: " + totalCost());
		System.out.println("********************************************************************************************************");
	}
	
	public void search(String title) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
			}
		}
		
		if(check == 0) {
			System.out.println("not found!");
		}
	}
	
	public void search(int id) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].printDetail());
				break;
			}
		}
		
		if(check == 0) {
			System.out.println("not found!");
		}
		
	}
}
