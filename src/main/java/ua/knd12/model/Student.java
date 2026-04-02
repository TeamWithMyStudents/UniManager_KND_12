package ua.knd12.model;

public class Student extends User {
    private String group;

    public Student(String name, String surname, int id, String group) {
        super(name, surname, id);
        this.group = group;
        this.id = getCounter();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
