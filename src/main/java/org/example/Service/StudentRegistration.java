package org.example.Service;

import org.example.Model.Student;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentList;

    public StudentRegistration() {
        this.studentList = new ArrayList<>();
    }

    public void saveStudent(Student student) {
        studentList.add(student);
        System.out.println("Student saved successfully: " + student.getName());
    }

    public void displayAllStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("===== Student List =====");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void updateStudent(int ID, String newName, String newProgram) {
        for (Student s : studentList) {
            if (s.getID() == ID) {
                s.setName(newName);
                s.setProgram(newProgram);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + ID + " not found.");
    }

    public void removeStudent(int ID) {
        studentList.removeIf(s -> s.getID() == ID);
        System.out.println("Student with ID " + ID + " removed.");
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}