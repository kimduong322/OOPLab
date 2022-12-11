package aims.media;
import java.util.*;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track intrack) {
		if(!tracks.contains(intrack)) {
			tracks.add(intrack);
		}
		else {
			System.out.println("Track is existed!");
		}
		
	}
	public void removeTrack() {
		Track intrack = new Track();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Information of track.\n Title: ");
		intrack.setTitle(sc.nextLine());
		System.out.println("Length of track: ");
		intrack.setLength(sc.nextInt());
		
		if(tracks.contains(intrack)) {
			tracks.remove(intrack);
		}
		else {
			System.out.println("Track does not exist!");
		}
		sc.close();
	}
	
	public int getLength() {
		int x = 0;
		for(Track u: tracks) {
			x += u.getLength();
		}
		return x;
	}
	public void play() {
		for(Track x: tracks) {
			x.play();
		}
	}
}
