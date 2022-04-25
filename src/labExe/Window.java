package labExe;

import javax.swing.*;

public class Window extends JFrame {
    public static final int WIN_WIDTH =400;
    public static final int WIN_HEIGHT=500;

    public static void main(String[] args) {
        Window win = new Window();

    }
    public Window(){
        this.setVisible(true);
        this.setSize(WIN_WIDTH,WIN_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        Scene scene = new Scene(0,0,WIN_WIDTH,WIN_HEIGHT);
        this.add(scene);



    }
}
