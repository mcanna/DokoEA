package src;

/**
 * Created by David on 17.10.2016.
 */
import java.util.Vector;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

/**
 * Created by David on 17.10.2016.
 */
public class Hand {
    public int getSize() {
        return hand.size();
    }

    private Vector hand;    //Vector containing all cards

    public Hand(){
        hand = new Vector();
     }

    public Hand(Vector v){
        hand = v;
    }

    public boolean addCard(Card c){
        return hand.add(c);
    }

    public boolean removeCard(Card c){
        if (hand.contains(c)) {
            hand.remove(c);
            return true;
        }
        else {
            System.out.println("The card" + c.getName() + "was not found in the deck and could therefore not be removed.");
            return false;
        }
    }

    public void listCards(){

        for (int i = 0; i < hand.size(); i++) {
            Card c = (Card)hand.get(i);
            System.out.println(c.getName());
        }
    }



}
