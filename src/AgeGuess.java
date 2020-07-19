import java.util.Scanner;
import java.util.Random;
public class AgeGuess {

	private static Scanner scan;

	public static void main(String[] args) {
		Random rand = new Random();
		int age = 101;
		int int_random = rand.nextInt(age);
		
		scan = new Scanner(System.in);
		
		System.out.println("Please Enter Age Guess:" );
		
		int ageGuess = scan.nextInt();

		System.out.println("Guessed Age: " +ageGuess);
		System.out.println("Actual Age: " +int_random);

	}

}