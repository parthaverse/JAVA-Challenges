//Create a program that print patterns (Left Half Pyramid).
import java.util.Scanner;
class Challange39c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int row= sc.nextInt();
        System.out.println("The pyramid pattern = ");
        pyramid(row);
    }
    public static void pyramid(int maxRow){
        int row=maxRow;
        while (row>0){
            int j=0;
            while (j<row-1){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while (i<= maxRow-row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
}
