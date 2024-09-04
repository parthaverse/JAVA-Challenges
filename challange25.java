//Create a program that shows use of left shift operator.
import java.util.Scanner;
public class challange25 {
    public static void main(String[] args) {
        int num, result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        num=sc.nextInt();
        result = num << 2;
        System.out.println("The result is "+result);
    }
}
