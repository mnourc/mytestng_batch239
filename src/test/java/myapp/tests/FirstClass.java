package myapp.tests;

import org.testng.annotations.Test;

public class FirstClass {


    //TestNG runs the methods in alphabetic order if there is no any other prioritization specified
    //If we use priority then testNG will run the methods based on the priority number order
    @Test(priority = 3)
    public void aMethod(){
        System.out.println("This is a method");
    }

    @Test(priority = 1)
    public void dMethod(){
        System.out.println("This is d method");
    }

    @Test(priority = 2)
    public void cMethod(){
        System.out.println("This is c method");
    }
}




