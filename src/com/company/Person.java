package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 *
 * Create a class named as “Person” with common properties  myName, myAge, myGender.Create its getters and setters methods.
 Write a Teacher class that extends the parent class Person.

 */
public class Person {
public String myName, myGender;
    public int myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public Person (String Name , int Age , String Gender){
setMyName(Name);
        setMyAge(Age);
        setMyGender(Gender);
    }

    public String toString(){//overriding the toString() method
        return "Name: "+ getMyName() + "\n"+
        "Age: "+ getMyAge() +"\n"+
                "Gender: "+ getMyGender();
    }
}

