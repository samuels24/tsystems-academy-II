package sk.telekom.oop1;

public abstract class Shape {
    public static Shape Circle;
    public static Shape Rectangle;
    public static Shape Square;
    private Color color = Color.BLUE;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract  void draw();
    public abstract void move(int deltaX, int deltaY);
    public abstract void resize(int rradius);
}
