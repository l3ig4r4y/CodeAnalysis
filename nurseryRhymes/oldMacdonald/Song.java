package nurseryRhymes.oldMacdonald;

public class Song {
	private String animalSound;
	public static boolean hasAnimal = false;
	
	// the method blow prints the beginning of the song and calles the pause method
	// to pause in between lines.
	public static final void songIntro () {
	
		System.out.println("Old MacDonald had a farm");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("And on that farm he had a ...");
		pause();
		System.out.println("Enter an animal to see if its on Mr. MacDonald's farm:");
	}

	// the method below pauses the program for 1500 millliseconds or 1.5 seconds.
	private static void pause()
	{
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//overleaded constructor that takes a string parameters and uses it to
	//continue the song using the printSong method
	public Song (String animal) {
		if(animal.equals("chicken")) {
			hasAnimal = true;
			animalSound = Chicken.cluck();
			printSong(animal, animalSound);
		} else {
			
			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
	
	//method that prints the rest of the song, takes 2 strings, 1 for the animal and 2nd
	// for the animal sound predetermined by the animal class method... in this case only chicken
	void printSong (String animal, String animalSound) {
		// lines printed with a pause in between
		System.out.println("Nice!!! He does have " + animal + "s");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("with a " + animalSound + " " + animalSound + " here...");
		pause();
		System.out.println(" and a " + animalSound + " " + animalSound + " there...");
		pause();
		System.out.println("  here a " + animalSound + " there a " + animalSound);
		pause();
		System.out.println("   everywhere a "  + animalSound + " " + animalSound + "!!!!!!");
		pause();
		System.out.println("    Old MacDonald had a farm");
		pause();
		System.out.println("     E - I - E - I - OoooOoOooo ");
	}
	
	//method that creates infinite loop based on loop condition, hasAnimal....
	private static void intro() {
		do{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
	}
}