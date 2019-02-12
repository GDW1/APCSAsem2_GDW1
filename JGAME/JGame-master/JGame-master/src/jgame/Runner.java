 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static jgame.GSprite.loadImageFromFile;

public class Runner extends Game implements ActionListener {
    GSprite character;
    GContainer c;
    double animationDeltaX;
    double animationDeltaY;
    public Runner() {
        animationDeltaX = -1;
        animationDeltaY = 0;
        GRootContainer root = new GRootContainer(Color.WHITE); // background
        setRootContainer(root);
         c = new GContainer();
        c.setSize(1000, 1000);
        character = new GSprite();
        character.setImage(loadImageFromFile(new File("C:\\Users\\guydw\\Desktop\\JGame-master\\JGame-master\\src\\jgame\\b5bb4f1d7b73e38cd44e775bf96a04f4.png")));
        Timer timer = new Timer(1, this);
        timer.start();
        c.add(character);
        root.add(c);
    }

    public static void main(String[] args){
        Runner g = new Runner();
        g.startGame("Game");
    }
    public void actionPerformed(ActionEvent e){
        if(character.getX() > c.getWidth()){
            animationDeltaX = -1;
            animationDeltaY = 0.001;
        }else if(character.getX()<0){
            animationDeltaY = 0.001;
            animationDeltaX = -1;
        }else if(character.getY()<0){
            animationDeltaY = 1;
            animationDeltaX = 0.001;
        }else if(character.getY()<c.getHeight()){
            animationDeltaY = 0.001;
            animationDeltaX = 1;
        }
        character.setX(character.getX() + animationDeltaX);
        character.setY(character.getY() + animationDeltaY + 0.01);

    }
}
