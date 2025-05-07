package com.example;


@DeveloperInfo(author = "Ruslan Trach", version = "1.0")
public class TestClass {

    @DeveloperInfo(author ="Ruslan Trach", version = "1.1")
    void testMethod(){
        System.out.println("Test annotation");
    }
}