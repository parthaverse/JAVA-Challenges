//Create a program to calculate the reverse of the number.
import java.util.Scanner;
public class Challange35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num= sc.nextInt();
        int reverse=reverse(num);
        System.out.println("The answer="+reverse);
    }
    public static int reverse(int num){
        int rev=0;
        while (num>0){
            rev=(num%10) + (rev*10);
            num=num/10;
        }
        return rev;
    }
}
