package nurseryRhymes;

import java.io.*;
import nurseryRhymes.oldMacdonald.*;

public class Main {
	
	public static void main(String[] args) {
		
		//the following two lines create two objects of the class
		// inputstreamreader and bufferedreader respectively,
		// they will help us read data from user's input and as it is
		// wrapped in the abstraction bufferedeader it helps provide a 
		// more efficient reading of the characters and lines
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader newinput = new BufferedReader(input); 

		// calls the static method of the Song class named .songIntro()
		Song.songIntro();
		// we use a loop to call the constructor of the class son that takes a string
		// since we will ask for user's input we wrap the following
		// in a try-catch
		do {
			try {
				//input is taken using the aforementioned objects (inpust.. bufferead..)
				String animal = newinput.readLine().toLowerCase();
				// a new instance of the constructor is initialized passing the user's input as a parameter
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}

