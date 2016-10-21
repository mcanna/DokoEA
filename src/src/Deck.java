package src;

import java.util.Random;
import java.util.Vector;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

/**
 * Created by David on 17.10.2016.
 */
public class Deck {
    public int getSize() {
        return deck.size();
    }

    private Vector <Card> deck;    //Vector containing all cards

    public Deck(){
        deck = new Vector();
    }

    public Deck(Vector v){
        deck = v;
    }

    public void addCard(Card c){
        deck.add(c);
    }

    public boolean removeCard(Card c){
        if (deck.contains(c)) {
            deck.remove(c);
            return true;
        }
        else {
            System.out.println("The card" + c.getName() + "was not found in the deck and could therefore not be removed.");
            return false;
        }
    }

    public void listCards(){
        System.out.println("The deck contains the following cards:");
        for (int i = 0; i < deck.size(); i++) {
            Card c = (Card)deck.get(i);
            System.out.println(i+1 + ". " + c.getName());
        }
     }

    public void shuffle(){
        Random random = new Random();
        for (int i=0; i<deck.size(); i++){
            int a = random.nextInt(deck.size()-i);
            Card c = deck.get(a);
            deck.remove(c);
            deck.addElement(c);
        }
        System.out.println("The deck was shuffled.");
    }

    public Card pop(){
        Card c = deck.firstElement();
        deck.remove(c);
        return c;
    }
}
