import java.util.Scanner;
import java.util.Random;
public class AgeGuessExercise4 {

	private static Scanner scan;

	public static void main(String[] args) {
		Random rand = new Random();
		int age = 101;
		int int_random = rand.nextInt(age);
		
		scan = new Scanner(System.in);
		
		System.out.println("Please Enter Age Guess:" );
		
		int ageGuess = scan.nextInt();
		
		if (ageGuess != int_random) {

		System.out.println("You guessed wrong!");
			
		if (ageGuess<int_random) {
			System.out.println("older");
		}
		if (ageGuess>int_random) {
			System.out.println("younger");
		}
			
		} else {
			
			System.out.println("Guessed Age: " +ageGuess);
			System.out.println("Actual Age: " +int_random);
			
		}

	}

}
//The program runs without errors!