package com.lulski.java8.functionalinterfaces;

import com.lulski.java8.data.Student;
import com.lulski.java8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);

    static Consumer<Student> c3 = (student) -> {
        System.out.print(student.getName());
    };

    static Consumer<Student> c4 = (student -> System.out.println(student.getActivities()));

    public static void printStudent() {
        System.out.println("printStudent");

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach(c2);


    }

    public static void printNameAndActivities() {
        System.out.println("::printNameAndActivities");
        List<Student> studentList = StudentDatabase.getAllStudents();

//        Consumer<Student> c3 = (student -> System.out.println(student.getName()));
//        Consumer<Student> c3 = student -> System.out.println(student.getName());
//        Consumer<Student> c3 = (student) -> {
//            System.out.print(student.getName());
//        };
//        Consumer<Student> c4 = (student -> System.out.println(student.getActivities()));

        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("::printNameAndActivitiesUsingCondition");
        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 1 && student.getGpa() > 3 ){
                c3.andThen(c4).accept(student);
            }
        });
    }


    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java 8");

//        printStudent();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
