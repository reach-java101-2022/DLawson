/**
 * @author Holly Norton
 * @date Mar 12, 2023
 * @filename SimpleDotCom.java
 */
package chap05;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
//get the user guess
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		// ^ makes a variable to hold result
		// Repeat with each cell in the int array
		for (int cell : locationCells) {
	//if user guess matches		
			if (guess == cell) {
				result = "hit";
				//increment the number of hits 
				numOfHits++;
				break;
			} //end if
		}//end for
	//find out if it was last cell	
		if (numOfHits == locationCells.length) { //if number of hits is 3
			result = "kill"; // return kill as result
		}
		//else it was not kill return hit, else miss
		System.out.println(result);
		return result;
	}
}
