/*Create a program that determines if a given year is a leap year (considering
 conditions like divisible by 4 but not 100, unless also divisible by 400).*/
import java.util.Scanner;
public class challange18 {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        year= sc.nextInt();
        if (((year % 4) == 0) && ((year % 100) != 0 || ((year%400) == 0 ))) {
            System.out.println("The year is a leap year.");
        }
        else {
            System.out.println("The year is not a leap year.");
        }
    }
}
