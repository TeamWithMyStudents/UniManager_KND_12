package ua.knd12.model;

public class Student extends User {
    private String group;

    public Student(String name, String surname, String group) {
        super(name, surname, 0);
        this.group = group;
        this.setId(getCounter());
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
