/*Create a program that calculates grades based on marks- A-> above 90% , B-> above 75%
C -> above 60% , D -> above 30% ,  F -> below 30%*/
import java.util.Scanner;
public class challange19 {
    public static void main(String[] args) {
        double mark;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark:");
        mark= sc.nextDouble();
        if(mark>=90){
            System.out.println("The grade is A.");
        } else if (mark>=75 && mark<90) {
            System.out.println("The grade is B.");
        }
        else if (mark>=60 && mark<75) {
            System.out.println("The grade is C.");
        }
        else if (mark>=30 && mark<60) {
            System.out.println("The grade is D.");
        }
        else {
            System.out.println("The grade is F.");
        }
    }
}
