//Create a program that determines if a number is odd or even.
import java.util.Scanner;

public class challange16{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}
