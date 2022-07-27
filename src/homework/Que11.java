package homework;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

public class Que11 { // public class

    public static void main (String [] args){ // main method

        System.out.println("Number divisible by 3"); // print statement
    for(int i=1;i<=100;i++) { //for loop to get number up to 100
        if(i%3==0){ // condition divisible with remainer 0
            System.out.print(i+","); // print statement
        }
    }
        System.out.println(); // as above print is print so having another sout print statement to have next line
    System.out.println("Number divisible by 5");

    for(int i=1; i<=100; i++){
        if(i%5==0){
            System.out.print(i+",");
        }
    }


    }
}
