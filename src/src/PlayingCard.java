package src;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by David on 17.10.2016.
 */
public class PlayingCard extends Card{
    Color color;
    int value;
    //Image img;

    public PlayingCard(String n, Color c){
        super(n);
        color = c;
        value = 0;
        //img = ...
    }

    public PlayingCard(String n, Color c, int v){
        super(n);
        color = c;
        value = v;
        //img = ...
    }

    /*
    public PlayingCard(String n, Color c, int v, String path){
        super(n);
        color = c;
        value = v;
        img = new Image(path);
    }
    */

    public String getName(){
        return (name + " of " + color.getColor());
    }
}
