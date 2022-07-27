package homework;

//Write a Java program to sum values of an array.

public class Que18 { // public class

    public static void main (String [] args){ // main method

        int a [] = {1, 3, 8, 43, 34, 68,88}; // Array int values
        int sum = 0; // create another variable
        for(int b: a)  // link variable
            sum+=b; // sum of variables
        System.out.println("sum values of an array is " + sum); // print statement
    }
}
