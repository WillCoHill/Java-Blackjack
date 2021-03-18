import java.util.*;

public class BlackjackHand extends Hand {
  int handValue;

  BlackjackHand() {
    super();
    handValue = 0;
  }

  public int handValue() {
    int handTally = 0;
    int tempVal;
    for (int i = 0; i < currentHand.size(); ++i) {
      tempVal = currentHand.get(i).getValue();
      if (tempVal >= 10) {
        handTally += 10;
      } else if(tempVal == 1 && handTally <= 10) {
        handTally += 11;
      } else {
        handTally += tempVal;
      }
    }
    return handTally;
  }

}