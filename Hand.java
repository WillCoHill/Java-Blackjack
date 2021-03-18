import java.util.*;

public class Hand {
  ArrayList<Card> currentHand = new ArrayList<>();

  Hand() {
    currentHand.clear();
  }

  public void addCardToHand(Card card) {
    currentHand.add(card);
  }

  public int handCount() {
    return currentHand.size();
  }

  public void clearHand() {
    currentHand.clear();
  }

  public String toString() {
    String retString = "";
    for (int i = 0; i < currentHand.size(); ++i) {
      retString += currentHand.get(i);
      retString += " \n";
    }
    return retString;
  }
}