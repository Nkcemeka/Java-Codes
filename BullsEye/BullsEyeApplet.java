////On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.

import java.awt.*;    // import the AWT graphic classes
import java.util.*;   // import the utility classes
import java.applet.*; // import the AWT graphic classes
import javax.swing.*; // import Swing

/**
 * BullsEyeApplet is an Applet that uses methods to draw it graphically.
 *
 * Note: There is a better way to write graphical Applets; this is just a simple demonstration.
 *       Also note that Applets are deprecated, but simple and good for teaching.
 * 
 * @author Cathy Bishop
 *
 */

public class BullsEyeApplet extends Applet
{
    // Instance Variables. Note: BOTH are declarations.

    BullsEye b1 = new BullsEye();
    BullsEye b2;

    public void init()
    {
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        BullsEye b3 = new BullsEye(Color.GREEN, Color.YELLOW);

        b3.setCenter(new Point(500,300));

        b2 = new BullsEye(Color.RED, Color.BLUE);
        b2.setCenter(new Point(800,400));
        b2.setWidth(300);

        System.out.println(b1);
        System.out.println("b2 width is: " + b2.getWidth());

        //b1.setFillOn();
        b2.setOutlineOn();

        //b1.paint(g);
        b2.paint(g);
        //b3.paint(g);

        b2.setCenter(new Point(200,400));
        b2.setWidth(300);
        b2.setFillOn();
        b2.setOutlineOff();
        b2.paint(g);

        checkColors();
    }

    public void checkColors()
    {
        if (b1.getColor1() == Color.WHITE)
            System.out.println("Color1 for b1 is white");
        if (b1.getColor2() == Color.WHITE)
            System.out.println("Color2 for b1 is white");
        if (b2.getColor1() == Color.WHITE)
            System.out.println("Color1 for b2 is white");
        if (b2.getColor2() == Color.WHITE)
            System.out.println("Color2 for b2 is white");
    }
}
