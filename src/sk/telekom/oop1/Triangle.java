package sk.telekom.oop1;

public class Triangle extends Shape {
    public Triangle(int x, int y, int segment) {
        this.x = x;
        this.y = y;
        this.segment = segment;


    }

    public Triangle(int x, int y, int side, Color color) {
        this(x, y, side);
        setColor(color);
    }


    private int x;
    private int y;
    private int segment;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSegment() {
        return segment;
    }

    public int getBottomX(){
        return x + segment/2;
    }
    public int getBottomY(){
        return (int)(y + segment * Math.sqrt(3) /2);
    }


    @Override
    public void draw() {
        System.out.println("Drawing triangle [" + x + ", " + y + "] with segment dimension " + segment + " and color " + getColor());

    }
    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX; //
        y += deltaY;
    }
    @Override
    public void resize(int rradius) {
        segment += rradius;


    }
}
