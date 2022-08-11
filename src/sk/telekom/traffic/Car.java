package sk.telekom.traffic;

public abstract class Car {
    private String regNumber;
    private Person person;

    public Car(String regNumber, Person person) {
        this.regNumber = regNumber;
        this.person = person;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public abstract void list();

}
