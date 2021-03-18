import java.util.*;

public class Deck {
  Card[] deckOfCards;
  protected int revealedCards = 0;
  protected int index = 0;

  Deck() {
    deckOfCards = new Card[52];
    int index = 0;
      for (int j = 0; j < 4; ++j) {
        for (int k = 1; k < 14; ++k) {
          deckOfCards[index] = new Card(j, k);
          ++index;
        }
      }
    
  }

  public String toString() {
    String retString = "";
    for(int m = 0; m < deckOfCards.length; ++m) {
      retString += deckOfCards[m];
      retString += " \n";
    }
    return retString;
  }

  public Card nextCard() {
    revealedCards += 1;
    Card retCard = deckOfCards[index];
    index += 1;
    return retCard;
  }

  public int numOfUnrevealedCards() {
    return (52 - revealedCards);
  }

  public void shuffle() {
    revealedCards = 0;
    index = 0;
    Collections.shuffle(Arrays.asList(deckOfCards));
  }
}