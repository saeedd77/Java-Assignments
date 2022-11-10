// Basics of Java
/* Assignment:
 1. How to create a class, object, method and its signature
 2. Write a program to print your name.
 3. Write a program for a Single line comment, multi-line and documentation comments
 */
package saeed.basics;

 class Assignment_Basics {
    private int member = 10;
    public int getMember() {// method definition 
        return member;
    }

    public static void main(String args[]){
        String surName = "Davawala"; // using variable
        System.out.println("Assignment 1,2,3: class, object, method, comments"); 
        System.out.println(" My name: Saeed Ahmed " + surName); // printing my name
        // Create object
        Assignment_Basics obj = new Assignment_Basics();
        System.out.println(" member = " + obj.getMember()); // calling a method
      
    }

 }