package labExe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovment implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key =e.getKeyCode();
        switch (key){
            case KeyEvent.VK_LEFT :
            break;
            case KeyEvent.VK_RIGHT:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
