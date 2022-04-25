package labExe;

import java.awt.*;

public class F1 {
    private int x;
    private int y;
    private final int width = 50;
    private final int height = 100;

    public F1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void pinte(Graphics graphics) {
        graphics.fillRect(
                this.x,
                this.y,
                this.width,
                this.height
        );
    }
}
