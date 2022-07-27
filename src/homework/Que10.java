package homework;

//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner; // import java scanner

public class Que10 { // public class

    public static void main (String [] agrs) { // main method

        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.println("Input a number "); // print statement
        int a = sc.nextInt(); // create user input in console
        System.out.println("Input Symbol"); // print statement
        char z = sc.next().charAt(0); // create user input of symbol
        System.out.println("Input another number");
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;

        if (z== '+') { // if condition
            System.out.println("addition of " + a + " + " + b + " is " + (c)); // print statement
        } else if (z=='-') {
            System.out.println("Subtraction of " + a + " - " + b + " is " + (d));
        } else if (z=='*') {
            System.out.println("multiplication of " + a + " * " + b + " is " + (e) );
        } else if (z=='/'){
            System.out.println("division of " + a + "/" + b + " is " + (f));
        } else {
            System.out.println("invalid input");
        }


    }



}
