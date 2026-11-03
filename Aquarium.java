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
        setPosition(painter, -70, -280);
        painter.setPenColor(new Color(139,69,19));
        drawTreasureChest(painter);
        painter.setPenColor(Color.WHITE);
        setPosition(painter, -40, -280);
        drawBubbles(painter, 10,-40,-250);
        setPosition(painter, 400, -270);
        painter.setPenColor(Color.ORANGE);
        painter.setPenWidth(20);
        drawStarfish(painter);
        setPosition(painter, -150, -270);
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
        placeSeaWeed(painter, -250, -350);
        placeSeaWeed(painter, -200, -320);
        placeSeaWeed(painter, -300, -350);
        placeSeaWeed(painter, 170, -315);
        placeSeaWeed(painter, 220, -350);
        placeSeaWeed(painter, 800, -350);
        placeSeaWeed(painter, 700, -350);
        placeSeaWeed(painter, 600, -350);
        painter.setPenWidth(9);
        setPosition(painter, -600, -320);
        painter.setPenColor(Color.YELLOW);
        drawSandFloor(painter);
        painter.setPenWidth(1);
        painter.setPenColor(Color.BLACK);
        drawBigFish(painter, 100, 600, 0, Color.MAGENTA);
        setPosition(painter, 480, 150);
        painter.setPenColor(Color.WHITE);
        drawBubbles(painter, 5,480,150);
        painter.setPenColor(Color.BLACK);
        drawBigFish(painter, 60, 1000, -250, Color.BLUE);
        setPosition(painter, 950, -150);
        painter.setPenColor(Color.WHITE);
        drawBubbles(painter, 5,950,-150);

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
        painter.moveTo(-70, -285);
        painter.lowerPen();
        painter.startFill(Color.YELLOW);
        drawRectangle(painter, 60, 10);
        painter.finishFill();
    }
    
    public static void drawBubbles(PainterAPI painter, int radius, int x, int y) {
        for (int i=0; i<5; i++){
            painter.circle(radius);
            painter.liftPen();
            painter.moveTo(x,y + (i*radius*3));
            painter.lowerPen();
        }
        }
        
    
    public static void drawSeaWeed(PainterAPI painter) {
            painter.turnLeft(90);
        for(int i = 0; i < 5; i++) {
            painter.forward(20);
            painter.turnLeft(20);
            painter.forward(20);
            painter.turnRight(20);
        }
            painter.turnRight(90);
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
            painter.forward(500);
            painter.turnLeft(10);
            painter.forward(200);
            painter.turnRight(10);
        }
    }
       
    public static void drawSandFloor(PainterAPI painter) {
        painter.startFill(Color.YELLOW);
        drawRectangle(painter, 2000, 800);
        painter.finishFill();
    }
    public static void drawBigFish(PainterAPI painter, int size, int x, int y, Color color) {
        setPosition(painter, x, y);
        painter.startFill(color);
        painter.circle(size);
        painter.finishFill();
        painter.liftPen();
        painter.moveTo(x + size -40, y + size -40);
        painter.lowerPen();
        painter.startFill(color);
        drawTriangle(painter, size);
        painter.finishFill();
        painter.setPenColor(Color.BLACK);
        painter.liftPen();
        painter.moveTo(x - (size-40), y + (size+40));
        painter.lowerPen();
        painter.startFill(Color.BLACK);
        painter.circle(size / 10);
        painter.finishFill();
    }
    public static void placeSeaWeed(PainterAPI painter, int x, int y) {
        setPosition(painter, x, y);
        painter.setPenColor(Color.GREEN);
        drawSeaWeed(painter);
    }
    
}
