package sk.tuke.register;

public class Main {

    public static void main(String[] args) throws Exception {
        var register = new Register(20);

        register.addPerson(new Person("Janko Hrasko", "0900123456"));
        register.addPerson(new Person("Samo Brasko", "0900123477"));
        register.addPerson(new Person("Fero Kral", "0900123488"));

        var ui = new ConsoleUI(register);
        ui.run();
    }
}
