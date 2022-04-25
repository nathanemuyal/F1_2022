package labExe;

import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {

    private F1 player;
    private F1 obstacle;


    public Scene(int x , int y , int width , int height){
        this.setBounds(x, y, width, height);
        this.mainLoop();/*
        this.player=new F1();*/
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    public void mainLoop (){
        new Thread(()->{
            while (true){
                PlayerMovment playerMovment =new PlayerMovment();
                this.setFocusable(true);
                this.requestFocus();
            }

        }).start();
    }
}
