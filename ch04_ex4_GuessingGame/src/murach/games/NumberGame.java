package murach.games;
/*dylaw
12:29:59 PM*/

import java.text.NumberFormat;

public class NumberGame {

	int upperLimit;
	int guess;
	int numguess;
	
	
	public NumberGame(int upperLimit) {
		super();
		this.upperLimit = 50;
	}
	
	
	public int getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	public int getGuess() {
		return guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	public int getNumguess() {
		return numguess;
	}
	public void setNumguess(int numguess) {
		this.numguess = numguess;
	}
	
	public void GuessCount() {
		numguess = numguess + 1;
	}
	
	public String getUpperLimitFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getUpperLimit());
        return numberFormatted;
	}
}
