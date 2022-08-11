
package sk.telekom.oop3;

public class Canvas {

    private Shape[] shapes;

    public Canvas(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void draw() {
        for (var shape : shapes) {
            shape.draw();
        }
    }

    public void move(int deltaX, int deltaY) {
        for (var shape : shapes) {
            shape.move(deltaX, deltaY);
        }
    }

    public void resize(int rradius){
    for (var shape : shapes)
        shape.resize(rradius);
    }
}


