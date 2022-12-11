package aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
		// TODO Auto-generated constructor stub
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}
}
