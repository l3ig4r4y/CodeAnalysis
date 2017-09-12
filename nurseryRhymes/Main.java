package nurseryRhymes;

import java.io.*;
import nurseryRhymes.oldMacdonald.*;

public class Main {
	
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader newinput = new BufferedReader(input); 

		Song.songIntro();
		
		do {
			try {
				String animal = newinput.readLine().toLowerCase();
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}

