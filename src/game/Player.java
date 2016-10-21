package game;

import src.Hand;

/**
 * Created by David on 17.10.2016.
 */
public class Player {
    String name;
    Hand hand;
    // Position

    public Player(String n) {
        name = n;
        hand = new Hand();
    }

    public void listHand(){
        System.out.println("The player " + name + " holds the following cards:");
        hand.listCards();
    }
}
