package homework;

//Input any alphabet from “A" to “F” and print their city name accordingly (use Switch)
// if any other alphabet should be invalid entry
import java.util.Scanner; // import java scanner

public class Que9 { // public statement

    public static void main (String [] args){

        System.out.print("Input any Alphabet - "); // console statement
        Scanner sc = new Scanner(System.in); // scanner object
        char name = sc.next().charAt(0) ; // create user input in console

//        String city [] = { "Ahmedabad", "Bombay", "Chandigadh", "Daman", "Essex", "Faizabad"};


        switch (name){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'b':
                System.out.println("Bombay");
                break;
            case 'C':
                System.out.println("Chandigadh");
                break;
            case 'c':
                System.out.println("Chandigadh");
                break;
            case 'D':
                System.out.println("Daman");
                break;
            case 'd':
                System.out.println("Daman");
                break;
            case 'E':
                System.out.println("Essex");
                break;
            case 'e':
                System.out.println("Essex");
                break;
            case 'F':
                System.out.println("Faizabad");
                break;
            case 'f':
                System.out.println("Faizabad");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }


}
