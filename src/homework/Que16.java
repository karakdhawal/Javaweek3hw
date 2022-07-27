package homework;

// Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner; // import java scanner

public class Que16 { // public class

    public static void main (String [] args) { // main method

        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.print("Please enter the number - "); // print user statement for console

        int a = sc.nextInt(); // create object for user input in console


        if (a>0){ // condition
            System.out.println ("enter number is POSITIVE"); // print stateemnt if above condition true
        } else if (a==0) {
            System.out.println("enter number is ZERO");
        } else { // condition - if above condition do not met
            System.out.println("enter number is NEGATIVE");
        }


    }
}
