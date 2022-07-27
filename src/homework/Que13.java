package homework;

// Write a Java program which input any number between 1 to 7 and it print
// The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
// NOTE: if number is out of selection Print message “Week contains 1 to 7 days”

import java.util.Scanner; // import java scanner

public class Que13 { // public class

    public static void main (String [] args ){ // main statement

        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.print("input any number between 1 to 7 - ");
        int a = sc.nextInt(); // create user input object

        switch (a){ // switch method
            case 1: // create case
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default: // condition for the rest of above option
                System.out.println("Week contains 1 to 7 days");
            }


        }


    }



