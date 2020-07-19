import java.util.Scanner;

public class UserNames {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Please enter first name: ");
		
		String firstname = scan.nextLine();
		
		System.out.println("Please enter last name: ");
		
		String lastname = scan.nextLine();
		
		int minimum = 10;
		int maximum = 99;
		int random = (int)(Math.random()*(maximum-minimum+1)+minimum);
		
		System.out.println(firstname);
		System.out.println(lastname);
		
		System.out.println(lastname.substring(0,4)+firstname.substring(0,1)+random);

	}

}