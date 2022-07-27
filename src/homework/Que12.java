package homework;

//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner; //import java scanner

public class Que12 { // public class

    public static void main(String[] args) { // main static method
        Scanner sc = new Scanner(System.in); // create scanner object
        char a1; // create char object
        System.out.print("Input value : "); // print statement
        a1=sc.next().charAt(0); // create user input in console for character including
        System.out.println(a1>='a'&&a1<='z'?"Small case alphabet ":a1>='A'&&a1<='Z'?"Capital Alphabet": a1>='0'&&a1<='9'?"Digit":"Symbol" );

    }


    }


