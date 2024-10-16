package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an object of RWOnly class
        RWOnly obj = new RWOnly();

        // Task 6: Set a value using the setter and access it using the getter
        obj.setName("John");  // Using the setter to set the value of name
        System.out.println(obj.getName());  // Using the getter to access the value of name
    }
}
