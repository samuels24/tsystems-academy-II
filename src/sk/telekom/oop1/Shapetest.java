package sk.telekom.oop1;

public class Shapetest {
    public static void main(String[] args) {
        var circle = new Circle(10, 5, 20, Color.RED);
        var rectangle = new Rectangle(3, 4, 20, 10);
        var square = new Square(40, 30, 20);
        var triangle = new Triangle(50, 20, 30);
        var point1 = new Point(14,20);
        var point2 = new Point(20,25);
        var point3 = new Point(33,40);
        var line = new Line(point2, point3);

        circle.setColor(Color.GREEN);
        rectangle.setColor(Color.YELLOW);
        rectangle.setColor(Color.RED);

        var shapes = new Shape[6];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        shapes[3] = triangle;
        shapes[4] = point1;
        shapes[5] = line;


//        for(var shape : shapes)
//            shape.draw();

        var canvas = new Canvas(shapes);
        System.out.println("**********************************************************************************************");

        canvas.draw();
        canvas.move(2, 3);


        System.out.println("**********************************************************************************************");

        canvas.draw();
        canvas.resize(10);

        System.out.println("**********************************************************************************************");

        canvas.draw();

        System.out.println("**********************************************************************************************");

//        circle.draw();
//        rectangle.draw();

//        var shape = new Shape();

//        Shape shape;
//        shape = circle;
//        shape = rectangle;
//
//        Object object;
//        object = shape;
//

    }
}
