package sk.telekom.oop1;

public class Square extends Shape {
    public Square(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.side = side;


    }

    public Square(int x, int y, int side, Color color) {
        this(x, y, side);
        setColor(color);
    }


    private int x;
    private int y;
    private int side;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSide() {
        return side;
    }


    @Override
    public void draw() {
        System.out.println("Drawing square [" + x + ", " + y + "] with dimension " + side + " on side and color " + getColor());

    }
    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX; //
        y += deltaY;
    }
    @Override
    public void resize(int rradius) {
        side += rradius;


    }
}
