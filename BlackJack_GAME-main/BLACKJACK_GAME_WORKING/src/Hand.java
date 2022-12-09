import java.util.ArrayList;

/**
 * A class that calculates the value of a hand of cards
 */
public class Hand {
    public static int calculateHandValue(ArrayList<PlayingCard> hand) {
        int handValue = 0;
        int numAces = 0;
        //calculate value of each card in hand
        for (PlayingCard card : hand) {
            if (card.faceValue() == PlayingCard.ACE) {
                //if card is an Ace, add 11 to hand value and keep track of number of aces
                handValue += 11;
                numAces++;
            } else if (card.faceValue() > 10) {
                //if card is a face card (Jack, Queen, King), add 10 to hand value
                handValue += 10;
            } else {
                //if card is any other number, add face value to hand value
                handValue += card.faceValue();
            }
        }
        return handValue;
    }
}