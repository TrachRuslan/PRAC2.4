package com.example;

public class MyClass {
    @DeprecatedMethod(message = "Цей метод застарілий і буде видалений в майбутньому")
    public void oldMethod(){
        System.out.println("Це застарілий метод");
    }
    public void newMethod(){
        System.out.println("Це новий метод");
    }

}