//Create a program that print patterns (Reverse Right Half Pyramid).
import java.util.Scanner;
class Challange39b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of the pyramid: ");
        int num= sc.nextInt();
        System.out.println("Here is the pattern pyramid=");
        pyramid(num);
    }
    public static void pyramid(int num){
        int row=0;
        while (num>row){
            System.out.print("*");
            int i=0;
            while (i< num-1) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            num--;
        }
    }
}
