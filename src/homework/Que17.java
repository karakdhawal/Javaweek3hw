package homework;

// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
// import Arrays package

public class Que17 { // public class

    public static void main (String [] args){ // main method

        int [] a ={ 23, 35, 67, 88, 98, 54, 32, 1, 5 }; // integer variables
        String [] name = {"Rohit", "Dhawan", "Gill", "Virat", "Pant", "Manish", "Bhuvi", "Chahal", "Dhoni"}; // string variables
        System.out.println("Original value: "+ Arrays.toString(a)); // print statement of original values
        Arrays.sort(a); // arrange above arrays values in order
        System.out.println("Sorted value" + Arrays.toString(a)); // print above arrange value
        System.out.println("Original value: "+ Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted value: " + Arrays.toString(name));

    }
}
