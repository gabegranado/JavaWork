/*
* this program makes a scethhash art inside a rectangular block
*
* gabe granado
* 11/13/18
*
* */

import gpdraw.DrawingTool;
import gpdraw.SketchPad;

import java.awt.*;

public class RectangleArt {
    private static DrawingTool pen;
    private static SketchPad myPaper;
    public static void drawLine(SketchPad paper, int x1, int y1, int x2, int y2){
        DrawingTool pen = new DrawingTool(paper);
        pen.up();
        pen.move(x1, y1);
        pen.down();
        pen.move(x2, y2);
    }
    //this makes the rectangle
    public static void rectangleArt(){
        int width = 500;
        int height = 315;
        int x1 = 0;
        int y1 = 315;
        int x2 = 500;
        int y2 = 315;
        //this makes the paper it is drawn on
        SketchPad paper = new SketchPad(1100,750);
        DrawingTool pen = new DrawingTool(paper);
        pen.drawRect(1000,630);

        // Draw top-right corner
        int n=0;
        //this makes the first top right corner art
        for (int i=315;i>-190;i-=5){
            pen.up();
            pen.move(n,315);//this goes to the next position on the top width side
            pen.down();
            n=n+5;
            //this takes the line and move the line to the next locatation on teh height side
            pen.move(500,i);
        }

        // Draw top-left corner
        n=0;
        //this makes the top left corner
        for (int i=315;i>-190;i-=5){
            pen.up();
            pen.move(n,315);
            pen.down();
            n=n-5;
            pen.move(-500,i);
        }


        // Draw bottom-right corner
        n=0;
        for (int i=-315;i<190;i+=5){
            pen.up();
            pen.move(n,-315);
            pen.down();
            n=n+5;
            pen.move(500,i);
        }
        // Draw bottom-left corner
        n=0;
        for (int i=-315;i<190;i+=5){
            pen.up();
            pen.move(n,-315);
            pen.down();
            n=n-5;
            pen.move(-500,i);
        }
    }
    //main method
    public static void main(String arg[]){
        RectangleArt test=new RectangleArt();
        test.rectangleArt();
    }
}

