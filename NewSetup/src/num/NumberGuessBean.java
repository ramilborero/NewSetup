package num;

import java.util.Random;






public class NumberGuessBean	 {

  int answer;
  boolean success;
  String hint;
  int numGuesses;

  public NumberGuessBean() {
    reset();
  }

  public void setGuess(String guess) {
    numGuesses++;

    int g;
    try {
      g = Integer.parseInt(guess);
    }
    catch (NumberFormatException e) {
      g = -1;
    }

    if (g == answer) {
      success = true;
    }
    else if (g == -1) {
      hint = "a number next time";
    }
    else if (g < answer) {
      hint = "higher number";
    }
    else if (g > answer) {
      hint = "lower number";
    }
  }

  public boolean getSuccess() {
    return success;
  }

  public String getHint() {
    return "" + hint;
  }

  public int getNumGuesses() {
    return numGuesses;
  }

  public void reset() {
    answer = Math.abs(new Random().nextInt() % 100) + 1;
    success = false;
    numGuesses = 0;
  }
}
