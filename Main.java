import java.util.*;

class Main {



  public static void main(String[] args) {
    System.out.println("Let's play some Blackjack! ♠♢♣♡");
    
    Scanner userInput = new Scanner(System.in);
    Deck d1 = new Deck();
    d1.shuffle();
    int userChoice;

    BlackjackHand dealerHand = new BlackjackHand();
    dealerHand.addCardToHand(d1.nextCard());
    dealerHand.addCardToHand(d1.nextCard());

    BlackjackHand userHand = new BlackjackHand();
    userHand.addCardToHand(d1.nextCard());
    userHand.addCardToHand(d1.nextCard());

    System.out.println("Here is the dealer's visible card: ");
    System.out.println(dealerHand.currentHand.get(0));
    if (dealerHand.currentHand.get(0).getValue() >= 10) {
      System.out.println("This cards value is: 10 \n");
    } else if (dealerHand.currentHand.get(0).getValue() == 1) {
      System.out.println("This cards value is: 11 \n");
    } else {
      System.out.println("This cards value is: " + dealerHand.currentHand.get(0).getValue() + " \n");
    }

    System.out.println("Here is your hand: ");
    System.out.println(userHand);
    System.out.println("Hand value: " + userHand.handValue() + "\n");

    while (true) {
      System.out.println("Enter 1 to hit or 2 to stop.");
      userChoice = userInput.nextInt();
      if (userChoice == 1) {
        userHand.addCardToHand(d1.nextCard());
        System.out.println("Here is your hand now: ");
        System.out.println(userHand);
        System.out.println("Hand value: " + userHand.handValue() + "\n");
        if (userHand.handValue() > 21) {
          System.out.println("Bust! Dealer wins");
          break;
          }
      }
        if (userChoice == 2) {
          System.out.println("Here is the dealer's hand: ");
          System.out.println(dealerHand);
          System.out.println("Hand value: " + dealerHand.handValue() + "\n");
          System.out.println("Alright! Let's tally the score...");
          System.out.println("Dealer hand total: " + dealerHand.handValue());
          System.out.println("User hand total: " + userHand.handValue());
          if (dealerHand.handValue() > userHand.handValue()) {
            System.out.println("Dealer wins.");
            break;
          } else if (dealerHand.handValue() < userHand.handValue()) {
            System.out.println("You've won! Here are your chips");
            break;
          }
        }
      }

  }
}