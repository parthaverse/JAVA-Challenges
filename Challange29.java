//Create a program to sum all odd numbers from 1 to a specified number N.
import java.util.Scanner;
public class Challange29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num= sc.nextInt();
        System.out.print("the addition=");
        int sum=oddNumbersAdd(num);
        System.out.println(sum);
    }
    public static int  oddNumbersAdd(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum=sum+i;
            i+=2;
        }
        return sum;
    }
}
