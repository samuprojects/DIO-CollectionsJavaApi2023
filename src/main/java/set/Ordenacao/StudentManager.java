package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("ALL")
public class StudentManager {

    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }
    
    public void addStudent(String name, Long registration, double grade){
        studentSet.add(new Student(name, registration, grade));
    }

    public void removeStudentsByRegistration (Long registration){
        Student studentToRemove = null;
        if (!studentSet.isEmpty()){
            for (Student s : studentSet){
                if(s.getRegistration() == registration) {
                    studentToRemove = s;
                    break;
                }
            }
            studentSet.remove(studentToRemove);
        } else {
            throw new RuntimeException("The set is empty!");
        }
        if (studentToRemove == null) {
            System.out.println("Registration not found!");
        }
    }

    public void showStudentsByName(){
        Set<Student> studentsByName = new TreeSet<>(studentSet);
        if (!studentSet.isEmpty()){
            System.out.println(studentsByName);
        } else {
            System.out.println("The set is empty!");
        }
    }

    public void showStudentsByGrade(){
        Set<Student> studentsByGrade = new TreeSet<>(new ComparatorGrade());
        if (!studentSet.isEmpty()){
            studentsByGrade.addAll(studentSet);
            System.out.println(studentsByGrade);
        } else {
            System.out.println("The set is empty!");
        }
    }

    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("Tadeu", 123456L, 7.5);
        studentManager.addStudent("Samuel", 123457L, 9.0);
        studentManager.addStudent("Carlos", 123458L, 5.0);
        studentManager.addStudent("André", 123459L, 6.8);

        System.out.println("Students in the manager:");
        System.out.println(studentManager.studentSet);

        studentManager.removeStudentsByRegistration(000L);
        studentManager.removeStudentsByRegistration(123457L);
        System.out.println(studentManager.studentSet);

        studentManager.showStudentsByName();

        studentManager.showStudentsByGrade();
    }


}
