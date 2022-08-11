package sk.telekom.oop1;

public class Line extends Shape {


    private Point point2;
    private Point point3;

    public Line(Point point2, Point point3) {
        this.point2 = point2;
        this.point3 = point3;
    }


    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }


    public void setcolor(Color green) {
    }

    @Override
    public void draw() {
        System.out.println("Drawing line [" + point2.getX() + ", " + point3.getY() + "] and color " + getColor());

    }

    @Override
    public void move(int deltaX, int deltaY) {
        point2.move(deltaX, deltaY);
        point3.move(deltaX, deltaY);

    }

    @Override
    public void resize(int rradius) {
   //     point3.move((int)(point3.getX()- point2.getX()) * (factor -1)), (int) ((point3.getY()- point2)) * (factor -1)))

    }
}
