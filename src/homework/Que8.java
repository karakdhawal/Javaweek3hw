package homework;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
// if any other alphabet should be invalid entry

//import java.util.Arrays;
   import java.util.Scanner; // import java scanner

public class Que8 { // public class

    public static void main (String [] args){ // public method

          System.out.print("Input any Alphabet - "); // console statement
          Scanner sc = new Scanner(System.in); // scanner object
          char name = sc.next().charAt(0) ; // create user input in console

          if (name=='A' || name=='a'){ // condition
              System.out.println("Ahmedabad");// print statement if above condition pass
          } else if (name=='B' || name=='b') {
              System.out.println("Bombay");
          } else if (name=='C' || name=='c') {
              System.out.println("Chandigadh");
          } else if (name=='D' || name=='d') {
              System.out.println("Daman");
          } else if (name=='E' || name=='e') {
              System.out.println("Essex");
          } else if (name=='F' || name=='f') {
              System.out.println("Faizabad");
          }else { // open condition if all above do not pass
              System.out.println("Invalid entry"); // print invalid statement
          }

//        String city [] = { "Ahmedabad", "Bombay", "Chandigadh", "Daman", "Essex", "Faizabad"};

    }

}
