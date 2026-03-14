package org.example.Model;

public class Instructor extends Person {
    private String Courses;

    public Instructor() {

    }

    public Instructor(int ID, String Name, String Courses) {
        super(ID, Name);
        this.Courses = Courses;
    }

    public String getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses = Courses;
    }

    @Override
    public void mainTask() {
        System.out.println("Teaching");
    }

    @Override
    public String toString() {
        return super.toString() + ", Courses: " + Courses;
    }
}