
public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	private String tiltle;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	
	public int getId() {
		return id;
	}
	public String getTiltle() {
		return tiltle;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}
	public DigitalVideoDisc(String tiltle) {
		super();
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
		this.tiltle = tiltle;
	}
	public DigitalVideoDisc(String tiltle, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
		this.tiltle = tiltle;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String tiltle, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
		this.tiltle = tiltle;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String tiltle, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		id = nbDigitalVideoDiscs;
		this.tiltle = tiltle;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public void printDetail() {
		System.out.println("---------------------------");
		System.out.println("Id: " + this.getId());
		System.out.println("Name: " + this.getTiltle());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Director: " + this.getDirector());
		System.out.println("Length: " + this.getLength());
		System.out.println("Cost: " + this.getCost());
		System.out.println("---------------------------");
	}
}
