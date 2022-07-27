package homework;

// Write another method getDaysInMonth with two parameter month and year. Both of type
//int.If parameter month is < 1 or >12 return -1.
//If parameter year is <1 or >9999 than return -1.
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//You should check if the year is a leap year using the method isLeapYear describe above.

import java.util.Scanner; // import java scanner

public class Que4NoofDays { // public class

    static Scanner sc = new Scanner( System.in); // called Scanner object

    public static void main (String [] args){ // main method

        int number_month, year; // variable with parameter
        int num_days = 0; // variable
        String month = "-1 since the parameter month is invalid"; // variable with output

        year(); // calling year method
        System.out.println("Please enter the Year"); // statement - console question
        year = sc.nextInt(); // create user input in console
        System.out.println("getDaysInMonth"); // statement - console questions
        number_month = sc.nextInt();// create user input in console



        switch (number_month){ // switch method

            case 1: // assign case in switch method
            //    month = "January";
           // num_days = 31;
                System.out.println(" 31 since January has 31 days.");
            break;
            case 2:
                month = "February";

            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
               //num_days = 29;
                System.out.println(" 29 since February has 29days in a year and " + year + " is a leap year.");
            } else{
            //num_days = 28;
                System.out.println( "28 since February has 28days in a year and " + year + " is a leap year.");
            }

                break;
            case 3:
                month = "March";
              //  num_days = 31;
                System.out.println(" 31 since March has 31 days.");
                break;
            case 4: month = "April";
             //   num_days = 30;
                System.out.println(" 30 since April has 30 days.");

                break;
            case 5: month = "May";
            //    num_days = 31;
                System.out.println(" 31 since May has 31 days.");
                break;
            case 6: month = "June";
                num_days = 30;
                break;
            case 7: month = "July";
            //    num_days = 31;
                System.out.println(" 31 since July has 31 days.");
                break;
            case 8: month = "August";
            //    num_days = 31;
                System.out.println(" 31 since August has 31 days.");
                break;
            case 9: month = "September";
                num_days = 30;
                break;
            case 10: month = "October";
//                num_days = 31;
                System.out.println(" 31 since October has 31 days.");
                break;
            case 11: month = "November";
                num_days = 30;
                break;
            case 12: month = "December";
//                num_days = 31;
                System.out.println(" 31 since December has 31 days.");
                break;
            default:
                System.out.println(month);


        }
        System.out.println("No of Days are " + num_days );


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
