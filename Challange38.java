//Create a program to verify if a number is a palindrome.
import java.util.Scanner;
public class Challange38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check: ");
        int num= sc.nextInt();
        boolean palindrome=palindrome(num);
        if(palindrome){
            System.out.println("The number " +num+ " is palindrome.");
        }
        else {
            System.out.println("The number " +num+ " is not palindrome.");
        }
    }
    public static boolean palindrome(int num){
        int reverse=reverse(num);
        if(num==reverse){
            return true;
        }
        return false;
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
