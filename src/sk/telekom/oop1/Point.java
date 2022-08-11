package sk.telekom.oop1;

public class Point extends Shape {
    private int x;
    private int y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setcolor(Color red) {
    }

    public void draw() {
        System.out.println("Drawing point [" + x + ", " + y + "] and color " + getColor());

    }

    @Override
    public void move(int deltaX, int deltaY) {

    }

    @Override
    public void resize(int rradius) {

    }
}
