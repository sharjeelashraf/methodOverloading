package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AddNumberClass A = new AddNumberClass();
        A.AddNumbers(1.2345f, 3);
        A.AddNumbers( 3, 1.2345f);
        A.AddNumbers( 3, 5);


        Teacher T = new Teacher("Sj", "male", "CS", 25, 50.000);


      //  System.out.println(T.toString("CS",50));
CollegeStudent CS = new CollegeStudent("S", 25,"male",111, 3.5, 2, "computer science");
        System.out.println("--------------------");

        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        System.out.println("--------------------");

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        System.out.println("--------------------");
       Teacher mrJava = new Teacher("Duke Java",  "M","Computer Science",34 , 50000);
        System.out.println(mrJava);
        System.out.println("--------------------");
      CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", 123, 4.0, 1, "English");
        System.out.println(ima);

        

    }
}
