package homework;
//Write a Java program to test if an array contains a specific value.
public class Que20 {

    public static void main (String [] args){

        int [] a = {1, 3, 13, 23, 37, 49};
        int find = 13;

        boolean test = false;

        for (int element : a){
            if (element==find){
                test = true;
                break;
            }
        }
        if(test){
            System.out.println("an Array containts "+ find);
        } else {
            System.out.println("an Array does not contains "+find);
        }
    }
}
