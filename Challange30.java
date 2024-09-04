//Write a function that calculates the factorial of a given number.
import java.util.Scanner;
public class Challange30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.print("The factorial of the " + num + " is =");
        int sum=factorial(num);
        System.out.println(sum);
    }
    public static int factorial(int num){
        int sum=1;
        while (num>=1){
//            System.out.println(num);
            sum=sum * num;
            num--;
        }
        return sum;
    }

}
