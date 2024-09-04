//Create a program to find the Greatest Common Divisor (GCD) of two integers.
import java.util.Scanner;
public class Challange33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int gcd=gcd(num1,num2);
        System.out.println("The answer= "+gcd);

    }
    public static int gcd(int num1, int num2){
        int gcd=1;
        int i=2;
        int small=smallNo(num1,num2);
        while (i<=small){
            if(num1 % i ==0 && num2 % i == 0){
                return i;
            }
            i++;
        }
        return gcd ;
    }
    public static int smallNo(int num1, int num2){
        if(num1>num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
