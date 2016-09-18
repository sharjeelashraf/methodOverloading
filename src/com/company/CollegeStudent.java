package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 Write a CollegeStudent subclass that extends the Student class.

 Add instance variables to the class for major (e.g. "Electrical Engineering", "Communications", "Undeclared")
 and year (e.g. FROSH = 1, SOPH = 2, ...). Major should be of type String andyear of type int.
 Choose appropriate names for the instance variables

 b.	Write a constructor for the CollegeStudent class. The constructor will use
 seven parameters to initialize myName, myAge, myGender, myIdNum, myGPA, year, and major.
 Use thesuper reference to use the constructor in the Student superclass to initialize the inherited values.

 c.	Write “setter” and “getter” methods for all of the class variables.
 For the CollegeStudent class they would be: getYear, getMajor, setYear, and setMajor.

 d.	Write the toString() method for the CollegeStudent class.
 Use a super reference to do the things already done by the superclass.
 */
public class CollegeStudent extends Student{
    String major = "undeclared";
    int year = 2;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CollegeStudent (String myName, int myAge, String myGender, int myIdNum, double myGPA, int year, String major)
    {
    super("Lynne Brooke", 16, "F", "HS95129", 3.5);
        setMyName(myName);
        setMyAge(myAge);
        setMyGender(myGender);
        int id = myIdNum;
        System.out.println();
        double GPA = myGPA;
        setYear(year);
        setMajor(major);

        System.out.println("Name: " + getMyName());
        System.out.println("Age: "+ getMyAge());
        System.out.println("Gender: "+ getMyGender());
        System.out.println("id: "+ id);
        System.out.println("GPA: "+ GPA);
        System.out.println("year: "+ getYear());
        System.out.println("major: "+ getMajor());
    }
}
