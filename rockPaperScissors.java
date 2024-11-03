import java.util.Scanner;

public class rockPaperScissors {
	public static int userScore, computerScore = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors Lizard Spock! The rules are:");
		System.out.println(
				"Paper beats Rock and Spock, Rock beats Scissors and Lizard, Scissors beats Paper and Lizard, Lizard beats Spock and Paper, Spock beats Scissors and Rock.\nType rock, paper, scissors, lizard, or spock to lock in your move!\n\nEnjoy! :)\n");
		System.out.print("Enter a mode (regular / hard): ");
		String mode = input.nextLine();
		if (mode.equals("regular")) {
			System.out.print("ROUND 1\nEnter a RPSLS throw: ");
			game();
			System.out.print("ROUND 2\nEnter a RPSLS throw: ");
			game();
			System.out.print("ROUND 3\nEnter a RPSLS throw: ");
			game();
			System.out.println(winner(userScore, computerScore));
		} else if (mode.equals("hard")) {
			System.out.print("ROUND 1\nEnter a RPSLS throw: ");
			hard();
			System.out.print("ROUND 2\nEnter a RPSLS throw: ");
			hard();
			System.out.print("ROUND 3\nEnter a RPSLS throw: ");
			hard();
			System.out.println(winner(userScore, computerScore));
		}
	}

	public static void game() {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine().toLowerCase();
		System.out.print("Computer selects: ");
		String computerChoice = compTurn();
		System.out.println(computerChoice);
		switch (userInput) {
		case "rock":
			System.out.println(
					"      _______\n  ---'   ____)\n        (_____)\n        (_____)\n        (____)\n  ---.__(___)\n");
			if (userInput.equals("rock") && computerChoice.equals("Scissors")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Lizard")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Rock")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Paper")) {
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Spock")) {
				break;
			}
		case "paper":
			System.out.println(
					"      _______\n  ---'   ____)____\n            ______)\n            _______)\n           _______)\n  ---.__________)\n");
			if (userInput.equals("paper") && computerChoice.equals("Rock")) {
				System.out.println("You win!\n");
				userScore++;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Spock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Paper")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Scissors")) {
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Lizard")) {
				break;
			}
		case "scissors":
			System.out.println(
					"      _______\n  ---'   ____)____\n            ______)\n         __________)\n        (____)\n  ---.__(___)\n");
			if (userInput.equals("scissors") && computerChoice.equals("Paper")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Lizard")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Scissors")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Rock")) {
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Spock")) {
				break;
			}
		case "lizard":
			System.out.println(
					"       __ \\/_\n      (' \\`\\\n   _\\, \\ \\\\/ \n    /`\\/\\ \\\\\n         \\ \\\\    \n          \\ \\\\/\\/_\n          /\\ \\\\'\\\n        __\\ `\\\\\\\n         /|`  `\\\\\n                \\\\\n                 \\\\\n                  \\\\    ,\n                   `---'  \n");
			if (userInput.equals("lizard") && computerChoice.equals("Spock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Paper")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Lizard")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Rock")) {
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Scissors")) {
				break;
			}
		case "spock":
			System.out.println(
					"  _\n (>\\       _\n(>\\ \\     /<)\n \\ \\ \\   / /\n  \\ \\ \\ / /<)\n   \\ \\ V / /\n  /| '   ` |\n | |       |\n |         |\n \\         /\n  |       |\n  |       |\n");
			if (userInput.equals("spock") && computerChoice.equals("Rock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Scissors")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Spock")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Lizard")) {
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Paper")) {
				break;
			}
		default:
			System.out.println("NOT A VALID THROW!\n");
			break;
		}
		switch (computerChoice) {
		case "Rock":
			if (userInput.equals("scissors") && computerChoice.equals("Rock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("Lizard") && computerChoice.equals("Rock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Paper":
			if (userInput.equals("rock") && computerChoice.equals("Paper")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Paper")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Scissors":
			if (userInput.equals("paper") && computerChoice.equals("Scissors")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Scissors")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Lizard":
			if (userInput.equals("spock") && computerChoice.equals("Lizard")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Lizard")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Spock":
			if (userInput.equals("rock") && computerChoice.equals("Spock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Spock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		}
	}

	public static String compTurn() {
		int computerChoice = (int) (Math.random() * 5) + 1;
		String result = "";
		if (computerChoice == 1) {
			result = "Paper";
		} else if (computerChoice == 2) {
			result = "Rock";
		} else if (computerChoice == 3) {
			result = "Scissors";
		} else if (computerChoice == 4) {
			result = "Lizard";
		} else if (computerChoice == 5) {
			result = "Spock";
		}
		return result;
	}

	public static String winner(int user, int computer) {
		String winner = "";
		if (user > computer) {
			return "Result: You win!";
		} else if (user < computer) {
			return "Result: Computer wins!";
		} else if (user == computer) {
			return "Result: Tie!";
		}
		return winner;
	}

	public static void hard() {
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine().toLowerCase();
		String computerChoice = "";
		if (userInput.equals("rock")) {
			computerChoice = "Paper";
		} else if (userInput.equals("spock")) {
			computerChoice = "Lizard";
		} else if (userInput.equals("paper")) {
			computerChoice = "Scissors";
		} else {
			computerChoice = compTurn();
		}
		System.out.print("Computer selects: ");
		System.out.println(computerChoice);
		switch (userInput) {
		case "rock":
			System.out.println(
					"      _______\n  ---'   ____)\n        (_____)\n        (_____)\n        (____)\n  ---.__(___)\n");
			if (userInput.equals("rock") && computerChoice.equals("Scissors")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Lizard")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Rock")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Paper")) {
				break;
			} else if (userInput.equals("rock") && computerChoice.equals("Spock")) {
				break;
			}
		case "paper":
			System.out.println(
					"      _______\n  ---'   ____)____\n            ______)\n            _______)\n           _______)\n  ---.__________)\n");
			if (userInput.equals("paper") && computerChoice.equals("Rock")) {
				System.out.println("You win!\n");
				userScore++;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Spock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Paper")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Scissors")) {
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Lizard")) {
				break;
			}
		case "scissors":
			System.out.println(
					"      _______\n  ---'   ____)____\n            ______)\n         __________)\n        (____)\n  ---.__(___)\n");
			if (userInput.equals("scissors") && computerChoice.equals("Paper")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Lizard")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Scissors")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Rock")) {
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Spock")) {
				break;
			}
		case "lizard":
			System.out.println(
					"       __ \\/_\n      (' \\`\\\n   _\\, \\ \\\\/ \n    /`\\/\\ \\\\\n         \\ \\\\    \n          \\ \\\\/\\/_\n          /\\ \\\\'\\\n        __\\ `\\\\\\\n         /|`  `\\\\\n                \\\\\n                 \\\\\n                  \\\\    ,\n                   `---'  \n");
			if (userInput.equals("lizard") && computerChoice.equals("Spock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Paper")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Lizard")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Rock")) {
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Scissors")) {
				break;
			}
		case "spock":
			System.out.println(
					"  _\n (>\\       _\n(>\\ \\     /<)\n \\ \\ \\   / /\n  \\ \\ \\ / /<)\n   \\ \\ V / /\n  /| '   ` |\n | |       |\n |         |\n \\         /\n  |       |\n  |       |\n");
			if (userInput.equals("spock") && computerChoice.equals("Rock")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Scissors")) {
				System.out.println("You win!\n");
				userScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Spock")) {
				System.out.println("Tie!\n");
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Lizard")) {
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Paper")) {
				break;
			}
		default:
			System.out.println("NOT A VALID THROW!\n");
			break;
		}
		switch (computerChoice) {
		case "Rock":
			if (userInput.equals("scissors") && computerChoice.equals("Rock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("Lizard") && computerChoice.equals("Rock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Paper":
			if (userInput.equals("rock") && computerChoice.equals("Paper")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("spock") && computerChoice.equals("Paper")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Scissors":
			if (userInput.equals("paper") && computerChoice.equals("Scissors")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("lizard") && computerChoice.equals("Scissors")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Lizard":
			if (userInput.equals("spock") && computerChoice.equals("Lizard")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("paper") && computerChoice.equals("Lizard")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		case "Spock":
			if (userInput.equals("rock") && computerChoice.equals("Spock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			} else if (userInput.equals("scissors") && computerChoice.equals("Spock")) {
				System.out.println("Computer wins!\n");
				computerScore += 1;
				break;
			}
		}
	}
}