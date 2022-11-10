// Variables of Java
/* Assignment:
    4. Define variables for different Data Types int, Boolean, char, float, double and print on the
        Console
    5. Define the local and Global variables with the same name and print both variables and
        understand the scope of the variables
    6. Write a function to print your name and call the function from main method
*/

package saeed.datatypes;

 class Assignment_Variables {
    public static int shared = 10;
    public float member = 20.0F;
    public void printName() { 
        System.out.println(" My name: Saeed Ahmed Davawala");
    }

    public void printVariable() { 
        int shared = 100; // local var named shared
        float member = 200.0F;
        System.out.println(" local shared = " + shared);
        System.out.println(" global shared = " + Assignment_Variables.shared);

        System.out.println(" local member = " + member);
        System.out.println(" object member = " + this.member);

    }
    public static void main(String args[]){
        System.out.println("Assignment 2: variables.");
        
        // Create object
        Assignment_Variables obj = new Assignment_Variables();
        obj.printName();
        obj.printVariable();
       
      
    }

 }