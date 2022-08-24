package org.examples.java;

import org.postgresql.Driver;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
try {	Class.forName("org.postgresql.Driver");
} catch (Exception e) {}


    }
}
