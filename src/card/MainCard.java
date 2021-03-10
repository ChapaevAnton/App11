package card;

import java.util.HashSet;
import java.util.Set;

public class MainCard {

    public static void main(String[] args) {

// TODO: 10.03.2021 10.5.8
        Set<Card> cardSet = new HashSet<>(36);

        for (int i = 0; i < 9; i++) {

            cardSet.add(new Card(Card.BUBI, Card.RANGS[i]));
            cardSet.add(new Card(Card.PEAKS, Card.RANGS[i]));
            cardSet.add(new Card(Card.WORMS, Card.RANGS[i]));
            cardSet.add(new Card(Card.BAPTIZE, Card.RANGS[i]));
        }

        cardSet.add(new Card(Card.BUBI, Card.RANGS[8]));
        cardSet.add(new Card(Card.BUBI, Card.RANGS[8]));
        cardSet.add(new Card(Card.BUBI, Card.RANGS[8]));
        cardSet.add(new Card(Card.BUBI, Card.RANGS[8]));

        for (Card card : cardSet) {
            System.out.println(card);
        }


        System.out.println("quantity Card:" + cardSet.size());

    }
}
