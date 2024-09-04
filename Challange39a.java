//Create a program that print patterns (Right Half Pyramid).
import java.util.Scanner;
class Challange39a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the line: ");
        int number= sc.nextInt();
        System.out.println("Here is the pattern pyramid is=");
        pyramid(number);

    }
    public static void pyramid(int number){
        int row=0;
        while (row<number){
            System.out.print("*");
            int i=0;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
