package homework;

//Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

import java.util.Scanner; // import java scanner



public class Que3 { // public class

    public static void main(String[] args) { // main method

            Scanner m1 = new Scanner(System.in); // create scanner object
            System.out.println("----------------------"); // print statement
            System.out.println("|                      |");
            System.out.println("|   Mark Sheet        |");
            System.out.println("|_____________________|");
            System.out.print("|   Name        : " );
            String name = m1.next(); // create user console input in alphabate for name
            //System.out.print("                      |");


            System.out.print("|   Roll No:    ");
            int no = m1.nextInt(); // create user input in number for Roll no
            System.out.println("|   Subjects    :   Marks"); // print statement
            System.out.print("|   Math        : " );
            int math = m1.nextInt(); // create user console input in number for Math

            do {
                System.out.println("Invalid Input, Marks should between 0 to 100"); // condition
                math = m1.nextInt(); // statement
            } while (math<=0 || math>=101 ); // condition
            System.out.print("|   Science      ");
            int sci = m1.nextInt();
        do {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            sci = m1.nextInt();
        } while (sci<=0 || sci>=101);


        System.out.print("|   English      ");
            int eng = m1.nextInt();
        do {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            eng = m1.nextInt();
        } while (eng<=0 || eng>=101);


        int total = math + sci + eng; // total variable
            System.out.println("|   Total        : " + total); // print statement

            double per = total / 3d;
            System.out.println("|   Percentage   : " + per);


            if (per >= 80) { // condition
                System.out.println("|   Result     :   Pass"); // statement
                System.out.println("|   Grade      :   A+  ");
            } else if (per < 80 && per >= 60) {
                System.out.println("|   Result     :   Pass");
                System.out.println("|   Grade      :   A   ");
            } else if (per < 60 && per >= 50) {
                System.out.println("|   Result     :   Pass");
                System.out.println("|   Grade      :   B   ");
            } else if (per < 50 && per >= 35) {
                System.out.println("|   Result     :   Pass");
                System.out.println("|   Grade      :   A+  ");
            } else {
                System.out.println("|   Result    :  Fail");
                System.out.println("|   Grade     : ");

            }


        }


    }



