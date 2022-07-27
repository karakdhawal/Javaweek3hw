package homework;

//Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%

import java.util.Scanner; // import java scanner

public class Que7 { // public class

    public static void main (String [] args){  //main method

        Scanner sc = new Scanner(System.in);
        System.out.print("Sales id      : ");
        int a = sc.nextInt(); // create user input in console
        System.out.print("Seller's name : ");
        String name = sc.next();
        System.out.print("Sales amount  : ");
        int b = sc.nextInt();
        if (b >=50000){ // create condition
            System.out.println("Sales commission is "+ (b*35/100)); // print statement for above condition
        } else if (b <50000 && b>=30000) {
            System.out.println("Sales comminssion is "+ (b*20/100));
        } else if (b <30000 && b>=20000){
            System.out.println("Sales comminsion is " + (b*10/100));
        } else if (b<20000 && b>=10000) {
            System.out.println("Sales comminssion is "+ (b*2/100));
        }else {
            System.out.println("Sales commission is " + (b*2/100));
        }

    }
}
