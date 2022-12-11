package aims;
import java.util.Scanner;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.media.Track;
import aims.store.Store;

public class Aims {
	private static Cart cart = new Cart();
	private static Store store = new Store();
	public static Scanner sc = new Scanner(System.in);
	public static int showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		return sc.nextInt();
	}
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public static void main(String[] args) {

//		selectInMenu();
		int selection;
		
		sc.close();
	}
	public static void selectInMenu() {
		int selection = 1;
		
		do {
			Aims.showMenu();
			selection = sc.nextInt();
			
			switch(selection) {
			case 0: System.exit(0);
			case 1: // display all the items in the store and goto storeMenu
			{
				store.available();
				selectInStoreMenu();
				break;
			}
			case 2: // allow the user to add a media to or remove a media from the store
			{
				System.out.println("Update(u) or Remove(r) item in Store? Please choose u-r!");
				String select = sc.nextLine();
				
				if(select.compareTo("r")==0) {
					System.out.println("Enter title of media");
					String title = sc.nextLine();
					Media x = store.searchByTitle(title);
					store.removeMedia(x);
				}
				else if(select.compareTo("u")==0) {
					System.out.println("Id: ");
					int id = sc.nextInt();
					System.out.println("Title: ");
					String title = sc.nextLine();
					System.out.println("Category: ");
					String category = sc.nextLine();
					System.out.println("Cost: ");
					float cost = sc.nextFloat();
					
					System.out.println("Book or CD or DVD?");
					System.out.println("Choose book-cd-dvd!");
					String secl = sc.nextLine();
					if(secl.compareTo("book")==0) {
						Book x = new Book(id, title, category, cost);
						// add author
						System.out.println("Enter list of authors. Enter \"stop\" for stop!");
						String author;
						
						do {
							author = sc.nextLine();
							if(author.compareTo("stop")==0) continue;
							x.addAuthor(author);
						}while(author.compareTo("stop")!=0);
						store.addMedia(x);
					}
					else if(secl.compareTo("cd")==0) {
						System.out.println("Name of artist?");
						String artist = sc.nextLine();
						System.out.println("Director?");
						String director = sc.nextLine();
						System.out.println("Length?");
						int length = sc.nextInt();
						CompactDisc x = new CompactDisc(id, title, category, cost, director, length);
						x.setArtist(artist);
						// add track
						System.out.println("Enter information of track that is you want to add! Enter \"stop\" for stop! Enter anything(ex. more) for add more!");
						String choose;
						do {
							choose = sc.nextLine();
							if(choose.compareTo("stop")==0) continue;
							Track intrack = new Track();
							System.out.println("Information of track.\n Title: ");
							intrack.setTitle(sc.nextLine());
							System.out.println("Length of track: ");
							intrack.setLength(sc.nextInt());
							x.addTrack(intrack);
						}while(choose.compareTo("stop")!=0);
						
						store.addMedia(x);
						
					}
					else if(secl.compareTo("dvd")==0) {
						System.out.println("Director?");
						String director = sc.nextLine();
						System.out.println("Length?");
						int length = sc.nextInt();
						DigitalVideoDisc x = new DigitalVideoDisc(id, title, category, cost, director, length);
						store.addMedia(x);
						
					}
				}
				break;
				
			}
			case 3: // information of the current cart and goto cartMenu
			{
				cart.displayCart();
				selectInCartMenu();
				break;
			}
			default:
				System.out.println("The selection is valid!");
			}
		}while(selection != 0);
	}
	
	public static void selectInStoreMenu() {
		int selection = 1;
		
		do {
			Aims.storeMenu();
			selection = sc.nextInt();
			switch(selection) {
			case 0: selectInMenu(); break;
			case 1: 
			{
				System.out.println("Enter title: ");
				String title = sc.nextLine();
				Media x = store.searchByTitle(title);
				if(x!=null) {
					System.out.println(x.toString());
					selectInMediaDetailsMenu(x);
				}
				else System.out.println("not found!");
				
				break;
			}
			case 2: 
			{
				System.out.println("Title of media:");
				String title = sc.nextLine();
				Media x = store.searchByTitle(title);
				cart.addMedia(x);
				break;
			}	
			case 3:
			{
				System.out.println("Title of media:");
				String title = sc.nextLine();
				break;
			}
			default:
				System.out.println("The selection is valid!");
			}
		}while(selection != 0);
	}
	
	public static void selectInMediaDetailsMenu(Media x) {
		int selection = 1;
		do {
			Aims.mediaDetailsMenu();
			selection = sc.nextInt();
			switch(selection) {
			case 0: Aims.selectInStoreMenu(); break;
			case 1:
				if(cart.addMedia(x)==1) {
					System.out.println("total in cart: " + cart.totalCost() + " $"); 
					selectInMediaDetailsMenu(x);
				}
				else {
					System.out.println("Cart full!"); 
					selectInMediaDetailsMenu(x);
				}
				break;
			case 2:
				if(x instanceof DigitalVideoDisc) {
					DigitalVideoDisc x_dvd = (DigitalVideoDisc)x;
					x_dvd.play();
				}
				else if(x instanceof CompactDisc) {
					CompactDisc x_cd = (CompactDisc)x;
					x_cd.play();
				}
				else System.out.println("Book cannot play! Try again!"); selectInStoreMenu();
				break;
			default:
				System.out.println("The selection is valid!"); selectInMediaDetailsMenu(x);
				break;
			}
		}while(selection != 0);
	}
	
	public static void selectInCartMenu() {
		int select = 1;
		do {
			Aims.cartMenu();
			select = sc.nextInt();
			switch(select) {
			case 0:
				
			}
		}while(select != 0);
	}
}

