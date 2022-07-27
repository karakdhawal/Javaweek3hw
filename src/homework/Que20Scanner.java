//package homework;
//
//import java.util.Scanner;
//
//public class Que20Scanner {
//
//    public static void main (String [] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter how many elements do you want? ");
//        int a = sc.nextInt();
//        int [] b = new int[a];
//        System.out.print ("Enter "+a+" elements in Array without any symbols :" );
//        int c= sc.nextInt();
//
//        System.out.print (" Enter the element do you want to find - ");
//        int find = sc.nextInt();
//
//        boolean test = false;
//
//        for (int element : c){
//            if (element==find){
//                test = true;
//                break;
//            }
//        }
//        if(test){
//            System.out.println("an Array containts "+ find);
//        } else {
//            System.out.println("an Array does not contains "+find);
//        }
//    }
//}
