package sk.telekom.oop1;

public class Circle extends Shape {

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(int x, int y, int radius, Color color) {
        this(x, y, radius);
        setColor(color);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    private int x;
    private int y;
    private int radius;

    @Override
    public void draw() {
        System.out.println("Drawing circle ["+x+", "+y+"] with radius "+radius+" and color "+ getColor());

    }

    @Override
    public void move(int deltaX, int deltaY) {
        x +=deltaX;
        y +=deltaY;
    }
    @Override
    public void resize(int rradius) {
        radius += rradius;
    }
}
