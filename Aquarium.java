import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(0);
        canvas.setBackgroundColor(Color.CYAN);
        setPosition(painter, -100, -200);
        painter.setPenColor(new Color(139,69,19));
        drawTreasureChest(painter);
        setPosition(painter, -70, -200);
        drawBubbles(painter, 20);
        setPosition(painter, 200, 220);
        painter.setPenColor(Color.WHITE);
        drawBubbles(painter, 20);
        painter.setPenColor(Color.WHITE);
        setPosition(painter, 200, 120);
        drawBubbles(painter, 20);
        painter.setPenColor(Color.WHITE);
        setPosition(painter, 250, 170);
        drawBubbles(painter, 20);
        setPosition(painter, 400, -260);
        painter.setPenColor(Color.ORANGE);
        painter.setPenWidth(20);
        drawStarfish(painter);
        setPosition(painter, -150, -260);
        painter.setPenColor(Color.PINK);
        drawStarfish(painter);
        painter.setPenWidth(1);
        setPosition(painter, 100, 50);
        painter.setPenColor(Color.BLACK);
        drawFish(painter, 100, 50, Color.RED);
        drawFish(painter, -150, 100, Color.BLUE);
        drawFish(painter, 100, -200, Color.YELLOW);
        setPosition(painter, -250, -150);
        painter.setPenWidth(5);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
        setPosition(painter, -200, -150);
        painter.turnLeft(90);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
        setPosition(painter, -300, -150);
        painter.turnLeft(90);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
        setPosition(painter, 150, -150);
        painter.turnLeft(90);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
        setPosition(painter, 200, -150);
        painter.turnLeft(90);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
        painter.setPenWidth(1);
        setPosition(painter, -450, -240);
        painter.turnLeft(90);
        painter.setPenColor(Color.YELLOW);
        drawSand(painter);
    }
    public static void drawSquare(PainterAPI painter, int size) {
            for (int i = 0; i < 4; i++) {
                painter.forward(size);
                painter.turnRight(90);
            }
        }
    
        public static void drawRectangle(PainterAPI painter, int width, int height) {
            for(int i = 0; i < 2; i++) {
                painter.forward(width);
                painter.turnRight(90);
                painter.forward(height);
                painter.turnRight(90);
            }
        }
        public static void drawTreasureChest(PainterAPI painter) {
        painter.startFill(new Color(139,69,19));
        drawRectangle(painter, 60, 40);
        painter.finishFill();
        painter.liftPen();
        painter.moveTo(-100, -200);
        painter.lowerPen();
        painter.startFill(Color.YELLOW);
        drawRectangle(painter, 60, 10);
        painter.finishFill();
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
    public static void drawFish(PainterAPI painter, int x, int y, Color color) {
        setPosition(painter, x, y);
        painter.startFill(color);
        painter.circle(30);
        painter.finishFill();
        painter.liftPen();
        painter.moveTo(x - 55, y + 20);
        painter.lowerPen();
        painter.startFill(color);
        drawTriangle(painter, 40);
        painter.finishFill();
        painter.setPenColor(Color.BLACK);
        painter.liftPen();
        painter.moveTo(x + 10, y + 40);
        painter.lowerPen();
        painter.startFill(Color.BLACK);
        painter.circle(3);
        painter.finishFill();
    }
    public static void drawStarfish(PainterAPI painter) {
        painter.startFill(Color.PINK);
        for(int i = 0; i < 5; i++) {
            painter.forward(70);
            painter.turnRight(144);
        }
        painter.finishFill();
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
        for(int i = 0; i < 30; i++) {
            painter.forward(20);
            painter.turnLeft(1);
            painter.forward(20);
            painter.turnRight(1);
        }
    }
} 

       
