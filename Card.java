public class Card {
  public int suitValue;
  public int cardValue;

  Card(int suit, int value) {
    suitValue = suit;
    cardValue = value;
  }

  public int getSuit() {
    return suitValue;
  }

  public int getValue() {
    return cardValue;
  }

  public String getSuitString() {
    if (suitValue == 0) {
      return "Hearts";
    } else if (suitValue == 1) {
      return "Diamonds";
    } else if (suitValue == 2) {
      return "Clubs";
    } else if (suitValue == 3) {
      return "Spades";
    } else {
      return "error";
    }
  }

  public String getValueString() {
    if (cardValue == 1) {
      return "Ace";
    } else if (cardValue == 2) {
      return "2";
    } else if (cardValue == 3) {
      return "3";
    } else if (cardValue == 4) {
      return "4";
    } else if (cardValue == 5) {
      return "5";
    } else if (cardValue == 6) {
      return "6";
    } else if (cardValue == 7) {
      return "7";
    } else if (cardValue == 8) {
      return "8";
    } else if (cardValue == 9) {
      return "9";
    } else if (cardValue == 10) {
      return "10";
    } else if (cardValue == 11) {
      return "Jack";
    } else if (cardValue == 12) {
      return "Queen";
    } else if (cardValue == 13) {
      return "King";
    } else {
      return "error";
    }
  }

  public String toString() { 
    return String.format(this.getValueString() + " of " + this.getSuitString()); 
  }
}