package homework;

// Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not?

import java.util.Scanner; // import java scanner

public class Que2 { // public class

    public static void main (String [] args){ // main method for print


        System.out.println("Year"); // print statement in console for user input
        Scanner sc = new Scanner(System.in); // call scanner class object
        int year = sc.nextInt(); // integer value linking with Scanner - year

        if (year%400==0){ // if condition
            System.out.println("leap Year"); //statement, line of code
        } else if (year%4==0 && year%100!=0) { // else if condition
            System.out.println("leap Year"); // statement, line of code
        }
        else { // else condition
            System.out.println("not a leap year"); // statement, line of code
        }


    }
}
