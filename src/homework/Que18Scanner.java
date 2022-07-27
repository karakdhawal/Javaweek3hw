package homework;
//Write a Java program to sum values of an array.
import java.util.Scanner;

public class Que18Scanner {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter how many elements do you want? ");
        int a = sc.nextInt();
        int [] b = new int[a];
        System.out.print ("Enter "+a+" elements in Array without any symbols :" );
        int sum = 0;
        for(int i=0; i<a; i++){
            b[i]= sc.nextInt();
            sum+=b[i];
        }
        System.out.print( "sum values of an array is " + sum);


    }

}
