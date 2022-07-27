package homework;

// Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner; // import scanner

public class Que6 { // public class

    public static void main (String [] args){ // main method

        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.print ("input any number - "); // print statement
        int a = sc.nextInt(); // create user input in console - its varialbe too

        int b = a%2; // create variable to finding remainer - if remainer is equal to 1 then its odd and remainer is equal to 0 then even

        if (b==1){ // using if - else - passing conditoin to find user input number
            System.out.println ("input number is odd");
        } else {
            System.out.println ("input number is even");
        }

    }

}
