package homework;

// Write a Java program to calculate the average value of array elements.

public class Que19 {

    public static void main (String [] args){

        int a [] = {1, 3, 8, 43, 34, 68,87}; // Array int values
        int n = a.length;
        int sum = 0; // create another variable
        for(int b: a)  // link variable
            sum+=b; // sum of variables
        System.out.println("sum values of an array is " + sum/n); // print statement
    }
}
