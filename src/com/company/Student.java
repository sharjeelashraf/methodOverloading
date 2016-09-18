package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 Write a CollegeStudent subclass that extends the Student class.
 */
public class Student extends Person {
String name, major;
    int age, year;
    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA){
        super("Coach Bob", 27, "M");
        setMyName(myName);
        setMyAge(myAge);
        setMyGender(myGender);
        String id = myIdNum;
        System.out.println();
        double GPA = myGPA;
        this.year = year;
        this.major= major;

        System.out.println("Name: " + getMyName());
        System.out.println("Age: "+ getMyAge());
        System.out.println("Gender: "+ getMyGender());
        System.out.println("id: "+ id);
        System.out.println("GPA: "+ GPA);
        System.out.println("year: "+ year);
        System.out.println("major: "+ major);
    }
}
