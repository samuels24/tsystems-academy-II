package sk.telekom.oop3;

public abstract class Shape {
    public static Shape Point;
    public static Shape Line;

    private Color color = Color.BLUE;

    public Color getColor() {
        return color;
    }
    public abstract  void draw();
}
