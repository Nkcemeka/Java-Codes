////On my honor, as a Carnegie-Mellon Africa student, I have neither given nor received unauthorized assistance on this work.


import java.awt.*;

public class BullsEye {
    
    private Color firstColor;
    private Color secondColor;

    // xc and yc are coordinates of the circle's center
    private double xc; 
    private double yc;

    private boolean fill;
    private boolean outline;

    //The corner coordinates and width of largest concentric circle
    private double x4;
    private double y4;
    private double widthCircle; // width of largest circle

    //The corner location and width of the 3rd largest concentric circle
    private double x3;
    private double y3;
    private double width3;

    //The corner location and width of 2nd largest concentric circle
    private double x2;
    private double y2;
    private double width2;

    //The corner location and width of 1st largest concentric circle
    private double x1;
    private double y1;
    private double width1;

    public BullsEye(){
        firstColor = Color.GREEN;
        secondColor = Color.BLUE;
        outline = false;
        fill = false;
        xc = 0.0;
        yc = 0.0;
        widthCircle = 400.0;
        width1 = widthCircle/4;
        width2 = width1*2;
        width3 = width1 * 3;
        x1 = xc - (width1/2);
        x2 = xc - (width2/2);
        x3 = xc - (width3/2);
        x4 = xc - (widthCircle/2);
        y1 = yc - (width1/2);
        y2 = yc - (width2/2);
        y3 = yc - (width3/2);
        y4 = yc - (widthCircle/2);
    }

    public BullsEye(Color firstClr, Color secondClr){
        firstColor = firstClr;
        secondColor = secondClr;
        outline = false;
        fill = false;
        xc = 0.0;
        yc = 0.0;
        widthCircle = 400.0;
        width1 = widthCircle/4;
        width2 = width1*2;
        width3 = width1 * 3;
        x1 = xc - (width1/2);
        x2 = xc - (width2/2);
        x3 = xc - (width3/2);
        x4 = xc - (widthCircle/2);
        y1 = yc - (width1/2);
        y2 = yc - (width2/2);
        y3 = yc - (width3/2);
        y4 = yc - (widthCircle/2);
    }

    public void setCenter(Point center){
        xc = center.x;
        yc = center.y;
    }

    public void setWidth(double width){
        widthCircle = width;

        // setting corner coordinates of each circle to pass to oval
        width1 = widthCircle/4;
        width2 = width1*2;
        width3 = width1 * 3;
        x1 = xc - (width1/2);
        x2 = xc - (width2/2);
        x3 = xc - (width3/2);
        x4 = xc - (widthCircle/2);
        y1 = yc - (width1/2);
        y2 = yc - (width2/2);
        y3 = yc - (width3/2);
        y4 = yc - (widthCircle/2);
    }

    public double getWidth(){
        return widthCircle;
    }

    public void setColor(Color one, Color two){
        firstColor = one;
        secondColor = two;
    }

    public Color getColor1(){
        return firstColor;
    }

    public Color getColor2(){
        return secondColor;
    }
    
    public void setFillOn(){
        fill = true;
    }

    public void setFillOff(){
        fill = false;
    }

    public void setOutlineOn(){
        outline = true;
    }

    public void setOutlineOff(){
        outline = false;
    }

    public void print(){
        System.out.println("First color of the Bullseye object is: " + firstColor);
        System.out.println("Second color of the Bullseye object is: " + secondColor);
        System.out.println("Width of the largest circle is: " + widthCircle);
        System.out.println("Width of the smallest circle is: " + width1);
        System.out.println("Width of the second largest circle is: " + width3);
        System.out.println("Width of the third largest circle is: " + width2);
        System.out.println("x-coordinate of the center of the circle is: " + xc);
        System.out.println("y-coordinate of the center of the circle is: " + yc);
    }

    public String toString(){
        return "The Bulleyes object has 4 concentric circles at coordinates: ("+ xc + "," + yc + ")";
    }

    public void paint (Graphics g){
        if (outline){
            g.setColor(firstColor);
            g.drawOval((int)x1, (int)y1, (int)width1, (int)width1);
            g.setColor(secondColor);
            g.drawOval((int)x2, (int)y2, (int)(width2), (int)(width2));
            g.setColor(firstColor);
            g.drawOval((int)x3, (int)y3, (int)(width3), (int)(width3));
            g.setColor(secondColor);
            g.drawOval((int)x4, (int)y4, (int)widthCircle, (int)widthCircle);
        }

        if (fill){
            g.setColor(secondColor);
            g.fillOval((int)x4, (int)y4, (int)widthCircle, (int)widthCircle);
            g.setColor(firstColor);
            g.fillOval((int)x3, (int)y3, (int)(width3), (int)(width3));
            g.setColor(secondColor);
            g.fillOval((int)x2, (int)y2, (int)(width2), (int)(width2));
            g.setColor(firstColor);
            g.fillOval((int)x1, (int)y1, (int)(width1), (int)(width1));
            
        }
    }
}
