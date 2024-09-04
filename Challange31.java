//Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;
public class Challange31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();
        int sum=sumOfDigit(num);
        System.out.println("the result="+sum);
    }
        public static int sumOfDigit(int num){
            int sum=0;
            while (num>0){
                sum=sum+(num%10);
                num=num/10;
            }
            return sum;
    }
}
