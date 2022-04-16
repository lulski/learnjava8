package com.lulski.java8.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents(){
        /*
        * 2nd grade students
        * */
        Student student1 = new Student("Amber","female",4.0, Arrays.asList("cooking","landscaping","pottery"),2);
        Student student2 = new Student("Romanowski","female",3.9,Arrays.asList("basketball","netball","volleyball"),2);

        /*3rd grade students*/
        Student student3 = new Student("Rozi","female",4.0, Arrays.asList("Muaythai","landscaping","pottery"),3);
        Student student4 = new Student("Szasz","female",3.9,Arrays.asList("basketball","netball","volleyball"),3);

        /*4rd grade students*/
        Student student5= new Student("Megan","female",2.5, Arrays.asList("cooking","landscaping","pottery"),4);
        Student student6 = new Student("Fox","female",2.4,Arrays.asList("basketball","netball","volleyball"),4);

        return Arrays.asList(student1,student2,student3,student4,student5,student6);
    }


}
