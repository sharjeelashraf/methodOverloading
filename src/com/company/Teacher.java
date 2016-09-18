package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 *
 * Create a class named as “Person” with common properties  myName, myAge, myGender.Create its getters and setters methods.
 Write a Teacher class that extends the parent class Person.
 a.	Add instance variables to the class for subject (e.g. “Computer Science”, "Chemistry", "English", "Other”)
 and salary (the teacher’s annual salary). Subject should be of type String and salary of type double.
 Choose appropriate names for the instance variables.

 b.	Write a constructor for the Teacher class. The constructor will use five parameters to initialize
 myName, myAge, myGender, subject, and salary. Use the super reference to use the constructor in the Person
 superclass to initialize the inherited values.

 c.	Write “setter” and “getter” methods for all of the class variables.
 For the Teacher class they would be: getSubject, getSalary, setSubject, and setSalary.


 d.	Write the toString() method for the Teacher class.
 Use a super reference to do the things already done by the superclass.
 */
public class Teacher extends Person{

    public String subject = "Computer Science";
    public double salary =0;
    public Teacher (){
        super("Coach Bob", 27, "M");



    }

    public Teacher (String myName, String myGender, String Subject, int myAge, double salary){
        super("Coach Bob", 27, "M");
        this.salary= salary;
        this.subject= Subject;
        this.setMyAge(myAge);
        this.setMyGender(myGender);
        this.setMyName(myName);

        setSubject(Subject);
        setSalary(salary);
    }
    public String toString(){//overriding the toString() method

        return  "Name: "+ getMyName() + "\n"+
                "Age: "+ getMyAge() +"\n"+
                "Subject: "+ this.subject +"\n"+
                "Salary: "+ this.salary +"\n"+
                "Gender: "+ getMyGender();
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
