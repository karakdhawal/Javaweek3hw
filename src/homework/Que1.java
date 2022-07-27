package homework;
// Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner; // import java util scanner

public class Que1 { // public class

    public static void main (String [] args){ // main method

        Scanner sc = new Scanner(System.in); // create scanner variable "sc"
        System.out.println("Input number "); // print console input statement

        int a = sc.nextInt(); // int variable

        String result = ( a % 2 ==0 ) ? "even" : "odd"; // use of ternary operator
        System.out.println("Input number is " + result); // print statement
    }
}
