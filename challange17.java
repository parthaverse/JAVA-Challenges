import java.util.Scanner;
//Create a program that determines the greatest of the three number.
public class challange17 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Num1 is the greatest number.");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Num2 is the greatest number.");
        }
        else {
            System.out.println("Num3 is the greatest number.");
        }
    }
}
