/**
 * @author Holly Norton
 * @date Mar 12, 2023
 * @filename Game.java
 */
package chap05;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int numOfGuesses = 0; //declare a variable to hold guess count and set to 0
		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom(); //make simple startup object
		int randomNum = (int) (Math.random() * 5); // compute random number between 0 and 4

		int[] locations = { randomNum, randomNum + 1, randomNum + 2 }; //make int array with 3 cell locations
		theDotCom.setLocationCells(locations); //invoke setlocationCells on startup object
		boolean isAlive = true; //declare a boolean isAlive
		
		while (isAlive == true) { //while the startup is still alive
			String guess = helper.getUserInput("enter a number"); //get imput
			//check it
			String result = theDotCom.checkYourself(guess); //invoke checkYourself() on Startup
			numOfGuesses++; //increment numOfGuesses
			if (result.equals("kill")) { //result is "kill"
				isAlive = false; //set isAlive to false
				System.out.println("You took " + numOfGuesses + " guesses"); //Print the number of guesses
			}//close if
		}//close while
	}
}
