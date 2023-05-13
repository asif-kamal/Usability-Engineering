import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();

        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(3, 1);
        boxes.add(box1);

        BouncingBox box2 = new BouncingBox(100, 150, Color.BLUE);
        box2.setMovementVector(4, 3);
        boxes.add(box2);

        BouncingBox box3 = new BouncingBox(300, 100, Color.YELLOW);
        box3.setMovementVector(-2, -3);
        boxes.add(box3);

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        // surface.draw3DRect(50, 40, 50, 40, true);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }

    }
}