package homework;

//If parameter month is < 1 or >12 return -1.
//If parameter year is <1 or >9999 than return -1.
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//You should check if the year is a leap year using the method isLeapYear describe above.


import java.util.Scanner; // import java scanner

public class Que5 {
// public class
    public static void main (String [] args){ // main method

        Scanner sc = new Scanner(System.in); // create java Scanner object
        System.out.println("_________________________________"); // print statement
        System.out.println("|          Salary Slip           |");
        System.out.println("|________________________________|");
        System.out.print  ("|Employee ID        : ");
        int a = sc.nextInt(); // create user in put in console in number
        System.out.print  ("|Employee Name      : ");
        String name = sc.next(); // create user input in console in alphabet
        System.out.println("|_______________________________|");
        System.out.print  ("|Basic Salary       : ");
        double b = sc.nextInt(); // create user input in console in number
        double c = (b*10)/100; // double variable base on variable b
        System.out.println("|HRA 10%            : " + c);
        double d = (b*8)/100;
        System.out.println("|TA 8%              : " + d);
        double e = (b*9)/100;
        System.out.println("|DA 9%              : " + e);
        double f = (b*20)/100;
        System.out.println("|PF - 20&           : " + f );
        System.out.println("|______________________________|");
        double g = (b+c+d+e-f);
        System.out.println("|Gross Salary       : " + g);
        System.out.println("|==============================|");



    }
}
