import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(0);
        setPosition(painter, -100, -200);
        drawTreasureChest(painter);
        setPosition(painter, -70, -200);
        drawBubbles(painter, 20);
        setPosition(painter, 50, -260);
        drawStarfish(painter);
        setPosition(painter, 100, 50);
        drawFish(painter);
        setPosition(painter, -250, -150);
        drawSeaWeed(painter);
        setPosition(painter, -200, -150);
        painter.turnLeft(90);
        drawSeaWeed(painter);
        setPosition(painter, -300, -150);
        painter.turnLeft(90);
        drawSeaWeed(painter);
        setPosition(painter, 150, -150);
        painter.turnLeft(90);
        drawSeaWeed(painter);
        setPosition(painter, 200, -150);
        painter.turnLeft(90);
        drawSeaWeed(painter);
        setPosition(painter, -450, -240);
        painter.turnLeft(90);
        drawSand(painter);
        //drawStarfish(painter);
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
            painter.moveTo(-70, -200  + (i * 30));
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
            painter.forward(70);
            painter.turnRight(144);
        }
    }
    public static void drawTriangle(PainterAPI painter, int size) {
        for(int i = 0; i < 3; i++) {
            painter.forward(size);
            painter.turnRight(120);
        }
    }
    public static void setPosition (PainterAPI painter, int x, double y) {
        painter.liftPen();
        painter.moveTo(x, y);
        painter.lowerPen();
    }
    public static void drawSand(PainterAPI painter) {
        painter.forward(1000);
    }
    }

       
