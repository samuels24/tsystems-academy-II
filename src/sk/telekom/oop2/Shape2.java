package sk.telekom.oop2;

public abstract class Shape2 {
    public static Shape2 Circle;
    public static Shape2 Triangle;
    public static Shape2 Square;
    public static Shape2 Rectangle;

    private Color2 color2 = Color2.BLUE;

    public Shape2(Color2 color2) {
        this.color2 = color2; //konstruktor
    }

    public Color2 getColor() {
        return color2;
    }

    public void setColor(Color2 color2) {
        this.color2 = color2;
    }

    public abstract  void draw();
    public abstract void move(int deltaX, int deltaY);
    public abstract void resize(int rradius);
}
