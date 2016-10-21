package src;

/**
 * Created by David on 17.10.2016.
 */

import com.sun.deploy.config.VerboseDefaultConfig;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Vector;

public class test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        PlayingCard TS = new PlayingCard("Ten", new Spades(),10);
        System.out.println(TS.color.getColor());
        System.out.println(TS.getName());

        Vector cards = new Vector();
        cards.add(TS);

        Deck doko = new Deck(cards);
        doko.listCards();
        doko.addCard(TS);
        doko.listCards();
        doko.removeCard(TS);
        doko.listCards();
    }
}
