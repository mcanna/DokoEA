package src;


import java.util.ArrayList;

/**
 * Created by David on 17.10.2016.
 */
public class Trick {
    int size;           //Current size of the trick
    ArrayList trick;    //List containing all cards of the tricks in order

    Trick(){
        trick = new ArrayList();
    }

    Trick(ArrayList t){
        trick = t;
    }

    public boolean addCard(Card c){
        return trick.add(c);
    }
}
