package garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

	public static void main(String[] args) {
		String filename = "E:\\Work\\Ki20221\\OOP\\OOPLab\\OtherProject\\Lab01\\src\\garbage\\LoremIpsum.txt"; // > 700 KB text
		byte[] inputbytes = {0};
		long startTime, endTime;
		
		try {
			inputbytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		startTime = System.currentTimeMillis();	
		String outputString = "";
		for(byte b : inputbytes) {
			outputString += (char)b;
		}
		endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime); // too slow, I can't wait for the results
	}

}
