//Create a program that determines if a number is positive, negative, or zero.
import java.util.Scanner;

public class challange15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num= sc.nextInt();
        if(num>0){
            System.out.println("The number is positive.");
        } else if (num==0) {
            System.out.println("The number is zero.");
        }
        else {
            System.out.println("The number is negative.");
        }
    }
}
