//Create a program to find number of occurrences of an element in an array.
import java.util.Scanner;
public class Challange41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size= sc.nextInt();
        int [] arr=new int[size];
        int index=0;
        while (index<size){
            System.out.print("Enter the element for position "+(index+1)+ " : ");
            arr[index]= sc.nextInt();
            index++;
        }
        System.out.print("Enter the number that want to find: ");
        int num= sc.nextInt();
        int occurrence=occurrence(arr,num);
        System.out.println("The number has found "+occurrence+" times in the array.");
    }
    public static int occurrence(int []arr,int num){
        int count=0;
        int i=0;
        while (i<arr.length){
            if(arr[i]==num){
                count++;
            }
            i++;
        }
        return count;
    }

}
