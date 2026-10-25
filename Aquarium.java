import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(10); // Lower number means faster, zero means as fast as possible. 
       // drawBubbles(painter, 30);
        //drawFish(painter);
        drawTurtle(painter);
        //drawSeaWeed(painter);
        //drawStarfish(painter);
        //drawTreasureChest(painter);
    }
    public static void drawSquare(PainterAPI painter, int size) {
            for (int i = 0; i < 4; i++) {
                painter.forward(size);
                painter.turnRight(90);
            }
        }
    
    public static void drawTreasureChest(PainterAPI painter) {
        for(int i = 0; i < 2; i++) {
            painter.forward(60);
            painter.turnRight(90);
            painter.forward(40);
            painter.turnRight(90);
        }
    }
    public static void drawBubbles(PainterAPI painter, int radius) {
        for(int i = 0; i < 5; i++) {
            painter.circle(15);
            painter.liftPen();
            painter.moveTo(0, i*50);
            painter.lowerPen();
        }
        
    }
    public static void drawSeaWeed(PainterAPI painter) {
            painter.turnRight(90);
        for(int i = 0; i < 5; i++) {
            painter.forward(20);
            painter.turnLeft(20);
            painter.forward(20);
            painter.turnRight(20);
        }
    }
    public static void drawFish(PainterAPI painter) {
        painter.circle(30);
        painter.liftPen();
        painter.moveTo(-65, 20);
        painter.lowerPen();
        drawTriangle(painter, 40);
        
    }
    public static void drawStarfish(PainterAPI painter) {
        for(int i = 0; i < 5; i++) {
            painter.forward(50);
            painter.turnRight(144);
        }
    }
    public static void drawTriangle(PainterAPI painter, int size) {
        for(int i = 0; i < 3; i++) {
            painter.forward(size);
            painter.turnRight(120);
        }
    }
    
}
