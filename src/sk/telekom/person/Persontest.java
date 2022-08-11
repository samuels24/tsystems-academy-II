package sk.telekom.person;

public class Persontest {
    public static void main(String[] args) {
        Person p1 = new Person("Janko", "Hrasko", 12);
        Person p2 = new Person("Zuzka", "Mudra",15);

//        p1.setFirstName("Janko");
//        p1.setLastName("Hrasko");
//        p2.setFirstName("Zuzka");
//        p2.setLastName("Mudra");
//        p1.setAge(12);
//        p2.setAge(15);

        //  Person[] person = new Person[10]; // prazdne pole kde mozem neskor zadat dalsie osoby
        p1.sayHello();
        p2.sayHello();

//        var person = new Person[3];
//        person[0] = p1;
//        person[1] = p2;
//        person[2] = new Person("Jozko", "Pucik", 21);
    }
}
