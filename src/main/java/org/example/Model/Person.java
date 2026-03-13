package org.example.Model;

public class Person {
    private int ID;
    private String Name;

    public Person() {}

    public Person(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Name: " + Name;
    }
}