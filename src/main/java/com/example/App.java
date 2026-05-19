package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Demo!");
        MathUtils utils = new MathUtils();
        System.out.println("Sum of 3 + 5 = " + utils.add(3, 5));
    }
}
