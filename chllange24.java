//Create a program that shows bitwise compliment of a number.
import java.util.Scanner;
public class chllange24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,result;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        result = ~ num;
        System.out.println("The result is "+result);
    }
}
