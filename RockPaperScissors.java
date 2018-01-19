import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Rock Paper Scissors! \nType '1' for rock, '2' for paper, '3' for scissors.");
		
		boolean choice = true;
		
		while (choice) {
			
			// GETS & OUTPUTS USER MOVE
			System.out.print("\nPlease enter your move: ");
			int userMove = scan.nextInt();
			
			// MAKES SURE USER MOVE IS VALID
			while (userMove != 1 && userMove != 2 && userMove != 3) {
				System.out.print("Invalid move. Please retry: ");
				userMove = scan.nextInt();
			}
			
			if (userMove == 1) {
				System.out.println("You played: ROCK");
			}
			if (userMove == 2) {
				System.out.println("You played: PAPER");
			}
			if (userMove == 3) {
				System.out.println("You played: SCISSORS");
			}

			// GETS & OUTPUTS COMPUTER MOVE
			int compMove = (int)(Math.random() * 3) + 1;
			if (compMove == 1) {
				System.out.println("Computer played: ROCK");
			}
			if (compMove == 2) {
				System.out.println("Computer played: PAPER");
			}
			if (compMove == 3) {
				System.out.println("Computer played: SCISSORS");
			}
			
			// OUTPUTS RESULT
			if (userMove == compMove) {
				System.out.println("It's a tie!");
			}
			
			if (userMove == 1 && compMove == 2) {
				System.out.println("Rock gets smothered by paper, you lose.");
			}
			if (userMove == 1 && compMove == 3) {
				System.out.println("Rock crushes scissors, you win!");
			}
			
			if (userMove == 2 && compMove == 1) {
				System.out.println("Paper smothers rock, you win!");
			}
			if (userMove == 2 && compMove == 3) {
				System.out.println("Paper gets cut by scissors, you lose.");
			}
			
			if (userMove == 3 && compMove == 1) {
				System.out.println("Scissors get crushed by rock, you lose.");
			}
			if (userMove == 3 && compMove == 2) {
				System.out.println("Scissors cut paper, you win!");
			}
			
			System.out.print("Would you like to continue? Type 1 for yes or 2 for no: ");
			int option = scan.nextInt();
			
			while (option != 1 && option != 2) {
				System.out.print("Invalid choice, enter 1 or 2: ");
				option = scan.nextInt();
			}
			
			
			if (option == 2) {
				choice = false;
			}
	
		}
		
		System.out.println("\nThank you for playing!");
	}
	
	
}
