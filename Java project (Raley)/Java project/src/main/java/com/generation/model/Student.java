package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();
    private final Map<String, Double> studentGrades = new HashMap<>();


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        courses.add(course);
        registerApprovedCourse(course);
    }

    public void registerApprovedCourse( Course course )
    {

        approvedCourses.put( course.getCode(), course );
        studentGrades.put(course.getCode(), 0.0);
    }

    public boolean isCourseApproved( String courseCode )
    {
        //TODO implement this method
        return approvedCourses.containsKey(courseCode);
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method
        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        return approvedCourses.containsKey(courseCode);
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        return new ArrayList<>(approvedCourses.values());
    }

    public void setStudentGrades(String courseId, Double grades) {
        studentGrades.put(courseId, grades);
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
