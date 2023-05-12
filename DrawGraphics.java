import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        box = new BouncingBox(200, 50, Color.RED);

        int xIncrement = 3;
        int yIncrement = 1;
        box.setMovementVector(xIncrement, yIncrement);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        // surface.draw3DRect(50, 40, 50, 40, true);
        box.draw(surface);
    }
}