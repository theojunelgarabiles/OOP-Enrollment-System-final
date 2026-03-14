package org.example.Model;

public class Student extends Person {
    private String program;

    public Student() {}

    public Student(int ID, String Name, String program) {
        super(ID, Name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void mainTask(){
    System.out.println("Studying");
    }

    @Override
    public String toString() {
        return super.toString() + ", Program: " + program;
    }
}