package com.lulski.java8.data;

import java.util.List;

public class Student {
    private String name;
    private String gender;
    private double gpa;
    private List<String> activities;
    private int gradeLevel;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{name: " + this.name
                + " gender: " + this.gender
                + " gpa: " + this.gpa
                + " grade: " + this.gradeLevel
                + " activities: " + this.activities
                + "}";
    }

    public Student(String name, String gender, double gpa, List<String> activities, int gradeLevel) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.activities = activities;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
