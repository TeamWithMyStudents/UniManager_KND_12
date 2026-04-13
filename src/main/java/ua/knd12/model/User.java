package ua.knd12.model;

public abstract class User {
    private int id;
    protected String name;
    protected String surname;
    private static int counter = 0;

    public User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        if (counter>=0)
            User.counter = counter;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}