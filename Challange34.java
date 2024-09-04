//Create a program to check whether a given number is prime.
import java.util.Scanner;
public class Challange34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=isPrime(num);
        if (prime){
        System.out.println("prime");
    }
        else {
            System.out.println("not prime");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while (num>i){
            if(num%i==0){
                return false;
            } i++;
        }
        return true;
        }
}
