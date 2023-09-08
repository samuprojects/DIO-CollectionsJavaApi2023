package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

@SuppressWarnings("ALL")
public class Student implements Comparable<Student> {

    private String name;
    private Long registration;
    private double grade;

    public Student(String name, Long registration, double grade) {
        this.name = name;
        this.registration = registration;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public long getRegistration() {
        return registration;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getRegistration() == student.getRegistration();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegistration());
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}

class ComparatorGrade implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}