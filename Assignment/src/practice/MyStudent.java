package practice;

public class MyStudent {
    int id;
    String name;
    String department;

    public MyStudent(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}

