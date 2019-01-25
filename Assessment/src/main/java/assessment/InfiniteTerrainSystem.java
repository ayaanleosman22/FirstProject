package assessment;

import java.util.Scanner;

public class InfiniteTerrainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
				+ "You notice a small watch-like device in your left hand.  \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time. \r\n" + "");
		magicCompass();
	}

	public static void magicCompass() {
		double dialnum = Math.random() * 11;
		System.out.println("Which direction would you like to go?");
		Scanner s = new Scanner(System.in);
		String direction = s.nextLine();

		if (direction.equals("North") || direction.equals("north")) {
			System.out.println("The dial reads " + dialnum + "m ");

			for (double newdialnum = --dialnum; newdialnum >= 0; newdialnum--) {
				System.out.println("Which direction would you like to go now?");
				Scanner input = new Scanner(System.in);
				String newdirection = input.nextLine();
				if (newdirection.equals("north") || newdirection.equals("North")) {
					System.out.println("Keep going! You have " + newdialnum + "m to go!");
				} else {
					System.out.println("Enter "+ direction +" for the feature of interest");
					magicCompass();
				}
			}
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");

		}

		else if (direction.equals("South") || direction.equals("south")) {
			System.out.println("The dial reads " + dialnum + "m");
			for (double newdialnum = --dialnum; newdialnum > 0; newdialnum--) {
				System.out.println("Which direction would you like to go now?");
				Scanner input = new Scanner(System.in);
				String newdirection = input.nextLine();
				if (newdirection.equals("south") || newdirection.equals("South")) {
					System.out.println("Keep going! You have " + newdialnum + "m to go!");
				} else {
					System.out.println("Enter " + direction + " to find treasure");
					magicCompass();
				}
			}
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
		}

		else if (direction.equals("East") || direction.equals("east")) {
			System.out.println("The dial reads " + dialnum + "m");
			for (double newdialnum = --dialnum; newdialnum > 0; newdialnum--) {
				System.out.println("Which direction would you like to go now?");
				Scanner input = new Scanner(System.in);
				String newdirection = input.nextLine();
				if (newdirection.equals("East") || newdirection.equals("east")) {
					System.out.println("Keep going! You have " + newdialnum + "m to go!");
				} else {
					System.out.println("Enter " + direction + " to find treasure");
					magicCompass();
				}

			}
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
		}

		else if (direction.equals("West") || direction.equals("west")) {
			System.out.println("The dial reads " + dialnum + "m");
			for (double newdialnum = --dialnum; newdialnum > 0; newdialnum--) {
				System.out.println("Which direction would you like to go now?");
				Scanner input = new Scanner(System.in);
				String newdirection = input.nextLine();
				if (newdirection.equals("West") || newdirection.equals("west")) {
					System.out.println("Keep going! You have " + newdialnum + "m to go!");
				} else {
					System.out.println("Enter " + direction + " to find treasure");
					magicCompass();
				}
			}
			System.out.println("You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
		}

		else {
			System.out.println("Enter a valid direction such as North, South, East or West");
			magicCompass();
		}

	}

}
