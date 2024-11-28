package lesson_two.hw.taskFive;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private float gpa;

    Student() {

    }
    Student(String name, int id, float gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.id == student.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student {name=" + name + ", id=" + id + ", gpa=" + gpa + "}";
    }

    @Override
    protected Object clone() {
        return new Student();
    }
}
