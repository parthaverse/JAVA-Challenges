//Create a program that shows bitwise OR of two numbers.
import java.util.Scanner;
public class challange22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter the two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        result=num1 | num2;
        System.out.println("The result is "+result);
    }
}