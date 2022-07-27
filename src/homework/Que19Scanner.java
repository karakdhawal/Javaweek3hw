package homework;
//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;

public class Que19Scanner {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements do you want? ");
        int a = sc.nextInt();
        double[] b = new double[a];
        System.out.print(" Enter "+ a + " elements of an Array without any symbols : " );
        double sum=0;
        for(int i=0; i<a; i++){
            b[i]=sc.nextDouble();
            sum+=b[i];
        }
        System.out.println("Average value of Array " + sum/a);


    }
}
