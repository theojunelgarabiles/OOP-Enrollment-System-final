package org.example;

import org.example.Model.Student;
import org.example.Model.Course;
import org.example.Service.StudentRegistration;
import org.example.Service.CourseRegistration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentRegistration studentReg = new StudentRegistration();
        CourseRegistration courseReg = new CourseRegistration();

        int choice;
        do {
            System.out.println("\n[1] Save Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Remove Student");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Program: ");
                    String program = scanner.nextLine();
                    Student student = new Student(id, name, program);
                    studentReg.saveStudent(student);
                    break;
                case 2:
                    studentReg.displayAllStudent();
                    break;
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Program: ");
                    String newProgram = scanner.nextLine();
                    studentReg.updateStudent(updateId, newName, newProgram);
                    break;
                case 4:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();
                    studentReg.removeStudent(removeId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}