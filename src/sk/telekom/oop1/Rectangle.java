package sk.telekom.oop1;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height, Color color) {
        this(x, y, width, height);
        setColor(color);
    }
    private int x;
    private int y;
    private int width;
    private int height;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getRightX(){
        return x + width;
    }

    public int getRightY(){
        return y + height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing rectangle [" + x + ", " + y + "] with dimensions " + width + " width, " + height + " height and color " + getColor());

    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX; //
        y += deltaY;
    }
    @Override
    public void resize(int rradius) {
        width += rradius;
        height += rradius;

    }
}
