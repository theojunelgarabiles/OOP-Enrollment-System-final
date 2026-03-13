package org.example.Service;

import org.example.Model.Course;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courseList;

    public CourseRegistration() {
        this.courseList = new ArrayList<>();
    }

    public void save(Course course) {
        courseList.add(course);
        System.out.println("Course saved successfully: " + course.getCourseName());
    }

    public void displayAll() {
        if (courseList.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        System.out.println("===== Course List =====");
        for (Course c : courseList) {
            System.out.println(c);
        }
    }

    public void updateCourse(String courseID, String newCourseName, String newProgram) {
        for (Course c : courseList) {
            if (c.getCourseID().equals(courseID)) {
                c.setCourseName(newCourseName);
                c.setProgram(newProgram);
                System.out.println("Course updated successfully.");
                return;
            }
        }
        System.out.println("Course with ID " + courseID + " not found.");
    }

    public void removeCourse(String courseID) {
        courseList.removeIf(c -> c.getCourseID().equals(courseID));
        System.out.println("Course with ID " + courseID + " removed.");
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}