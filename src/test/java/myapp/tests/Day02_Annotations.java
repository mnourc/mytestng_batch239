package myapp.tests;

import org.testng.annotations.*;

public class Day02_Annotations {

//    natural order ==> alphabetical(a-z)  or  ascending(number)

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite...");
    }

    @BeforeTest
    public void beforeTest (){
        System.out.println("Before test...");
    }

    @BeforeGroups
    public void beforeGroups(){

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class .. ");
    }

    @BeforeMethod
    public void beforeMethods(){
        System.out.println("Before methods .. ");
    }




    @Test(priority = 2)
    public void test01() {
        System.out.println("Test case 1");

    }

    @Test (priority = 5)
    public void test02() {
        System.out.println("Test case 2");

    }

    @Test(priority = 4)
    public void test03() {
        System.out.println("Test case 3");


    }

    @Test
    public void test04() {
        System.out.println("Test case 4");


    }

    @Test (priority = 1)
    public void test05() {
        System.out.println("Test case 5");

    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test .. ");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After groups .. ");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class .. ");
    }

    @AfterMethod
    public void afterMethods(){
        System.out.println("After methods .. ");
    }



    // PRINTING ORDER
//    Before suite..
//    Before test..
//    Before class..
//    Before method..
//    Test Case 1
//    Before method..
//    Test Case 2
//    Before method..
//    Test Case 3
//    Before method..
//    Test Case 4
//    Before method..
//    Test Case 5


}