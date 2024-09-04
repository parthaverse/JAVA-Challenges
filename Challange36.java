//Create a Java program to fibonacci series.
import java.util.Scanner;
class Challange36{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        System.out.print("The fibonacci series:");
        fibonacci(num);
    }
    public static void fibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first=0, second=1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}