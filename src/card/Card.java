package card;

import java.util.Objects;

public class Card {

    public final static String BAPTIZE = "крести";
    public final static String BUBI = "буби";
    public final static String PEAKS = "пики";
    public final static String WORMS = "черви";

    public final static String[] RANGS = {
            "шесть",
            "семь",
            "восемь",
            "девять",
            "десять",
            "валет",
            "дама",
            "король",
            "туз"};

    private final String suit;
    private final String rang;

    Card(String suit, String rang) {
        if (suit == null || rang == null) throw new IllegalArgumentException();
        this.suit = suit;
        this.rang = rang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return suit.equals(card.suit) && rang.equals(card.rang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rang);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }
}
