package com.company;

/**
 * Created by lab2 on 18-Sep-16.
 * a.	Define method named as “addNumbers” with two parameters first of type int and second of type float and method
 * return type float.That method will calculate sum of two numbers and return total sum in float type.
 *
 * c.	Define another method named as “addNumbers” with two parameters first of type int and second of type “int”
 * and method return type int.That method will also calculate sum of two numbers and return total sum in int type.
 */
public class AddNumberClass {
    int x, x2; float y;
    public void AddNumbers (int x, float y)
    {
        this.x = x;
        this.y = y;

        System.out.println ((float) x + y);
    }

    public void AddNumbers ( float y,int x)
    {
        this.x = x;
        this.y = y;

        System.out.println ((float) x + y);
    }
    public void AddNumbers (  int x2,int x)
    {
        this.x = x;
        this.x2 = x2;
        //this.y = y;

        System.out.println ((int) x + x2);
    }

    int mymethod(int a, int b, float c)
    {
        //example
        return a;
    }

}

