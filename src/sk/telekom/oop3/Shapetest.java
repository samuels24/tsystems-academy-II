package sk.telekom.oop3;

import sk.telekom.oop1.Line;
import sk.telekom.oop1.Point;

public class Shapetest {
    public static void main(String[] args) {
        var point1 = new Point(18,5);
        var point2 = new Point (15, 10);
        var point3 = new Point(18,16);
        var line = new Line(point2,point3);
        point1.setcolor(Color.RED);
        line.setcolor(Color.GREEN);

        var shapes = new Shape[2];
        shapes[0] = point1;
        shapes[1] = line;

        var canvas = new Canvas(shapes);
        canvas.draw();

    }
}
