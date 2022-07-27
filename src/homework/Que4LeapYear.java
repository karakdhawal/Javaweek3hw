package homework;
// Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

import java.util.Scanner;

public class Que4LeapYear {

    public static void main(String[] args) {
        year();
    }

    static void year() {
        System.out.print("isleapyear ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1 || year > 9999) { // if condition
            System.out.println("false since the parameter is not in the range (1-9999)"); //statement, line of code
        } else if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) { // else if condition
            System.out.println("true since " + year + " is a leap Year"); // statement, line of code
        } else { // else condition
            System.out.println("false since " + year + " is not a leap year"); // statement, line of code
        }

    }



}
