/*Create a program that categorize a person into different age groups - Child -> below 13
Teen -> below 20 Adult -> below 60 Senior-> above 60*/
import java.util.Scanner;
public class challange20 {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        age= sc.nextInt();
        if (age<13){
            System.out.println("The person is child.");
        } else if (age<20 && age>=13 ) {
            System.out.println("The person is teen.");
        }
        else if (age<60 && age>=20) {
            System.out.println("The person is adult.");
        }
        else {
            System.out.println("The person is senior.");
        }

    }
}
