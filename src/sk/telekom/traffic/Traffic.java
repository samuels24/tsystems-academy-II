package sk.telekom.traffic;

public abstract class Traffic {
    public static Traffic Person;
    public static Traffic Car;
    public static Traffic Bus;
    public static Traffic Truck;

    public abstract  void draw();
}
