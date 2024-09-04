//Write a program to check if a given number is even or odd using bitwise operators.
import java.util.Scanner;
public class challange27 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if((num & 1)==1){
            System.out.println("The number is odd.");
        }
        else {
            System.out.println("The number is even.");
        }

    }
}
