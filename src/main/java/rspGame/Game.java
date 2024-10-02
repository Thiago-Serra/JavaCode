package rspGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		String[] rps = {"r","p","s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		
		String playerMove;
		
		while(true) {
		System.out.println("Please enter your move (r, p or s)");
		 playerMove = scan.nextLine();
		 if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
		  break;
		}
		System.out.println(playerMove + " is not a valid move");
		}
		System.out.println("computer played " + computerMove);
		
		if(playerMove.equals(computerMove)) {
			System.out.println("It's a tie! :O ");
		}
		else if(playerMove.equals("r")) {
			if(computerMove.equals("p")) {
				System.out.println("You lose! :( ");
			}
			else if(computerMove.equals("s")) {
				System.out.println("You Win!! :D ");				
			}
			else if(playerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("You lose! :( ");
				}
				else if(computerMove.equals("r")) {
					System.out.println("You Win!! :D ");
				}
				else if(playerMove.equals("s")) {
					if(computerMove.equals("r")) {
						System.out.println("You lose! :( ");
					}
					else if(computerMove.equals("p")) {
						System.out.println("You Win!! :D ");
				    	}
			    	}
		   }
	    }
		System.out.println("play again? (y/n)");
		String playAgain = scan.nextLine();
		if(!playAgain.equals("y")) {
			break;
		}
		
		
		} 
	
	
 }
   
 		
}
