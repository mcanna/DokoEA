package game;/**
 * Created by David on 21.10.2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import src.*;

public class DokoHalf extends Application {
    int players = 2;
    Player playerOne = new Player("one");
    Player playerTwo = new Player("two");
    Deck deck;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        deck = initializeDeck();
        deck.shuffle();
        deck.listCards();

        distributeCards();

        play();
    }

    // Creates half a Doko deck
    public Deck initializeDeck(){
        Deck deck = new Deck();

        Color clubs = new Clubs();
        Color hearts = new Hearts();
        Color spades = new Spades();
        Color diamonds = new Diamonds();

        PlayingCard c;

        c = new PlayingCard("Ace", clubs, 11);  deck.addCard(c);
        c = new PlayingCard("Ten",clubs, 10);   deck.addCard(c);
        c = new PlayingCard("King",clubs, 4);   deck.addCard(c);
        c = new PlayingCard("Queen",clubs,3);   deck.addCard(c);
        c = new PlayingCard("Jack",clubs, 2);   deck.addCard(c);
        c = new PlayingCard("Nine",clubs, 0);   deck.addCard(c);

        c = new PlayingCard("Ace",hearts, 11);  deck.addCard(c);
        c = new PlayingCard("Ten",hearts, 10);   deck.addCard(c);
        c = new PlayingCard("King",hearts, 4);   deck.addCard(c);
        c = new PlayingCard("Queen",hearts,3);   deck.addCard(c);
        c = new PlayingCard("Jack",hearts, 2);   deck.addCard(c);
        c = new PlayingCard("Nine",hearts, 0);   deck.addCard(c);

        c = new PlayingCard("Ace",spades, 11);  deck.addCard(c);
        c = new PlayingCard("Ten",spades, 10);   deck.addCard(c);
        c = new PlayingCard("King",spades, 4);   deck.addCard(c);
        c = new PlayingCard("Queen",spades,3);   deck.addCard(c);
        c = new PlayingCard("Jack",spades, 2);   deck.addCard(c);
        c = new PlayingCard("Nine",spades, 0);   deck.addCard(c);

        c = new PlayingCard("Ace",diamonds, 11);  deck.addCard(c);
        c = new PlayingCard("Ten",diamonds, 10);   deck.addCard(c);
        c = new PlayingCard("King",diamonds, 4);   deck.addCard(c);
        c = new PlayingCard("Queen",diamonds,3);   deck.addCard(c);
        c = new PlayingCard("Jack",diamonds, 2);   deck.addCard(c);
        c = new PlayingCard("Nine",diamonds, 0);   deck.addCard(c);

        return deck;
    }

    public void distributeCards(){
        while (deck.getSize()>0) {
            playerOne.hand.addCard(deck.pop());
            playerOne.hand.addCard(deck.pop());
            playerOne.hand.addCard(deck.pop());
            playerTwo.hand.addCard(deck.pop());
            playerTwo.hand.addCard(deck.pop());
            playerTwo.hand.addCard(deck.pop());
        }
        System.out.println("The cards were distributed.");
    }

    public void play(){
        //...
    }
}
