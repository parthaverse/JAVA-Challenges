//Create a program to check if the given array is sorted.
import java.util.Scanner;
public class Challange43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size= sc.nextInt();
        int[] arr=new int[size];
        int index=0;
        while (index<arr.length){
            System.out.print("Enter the element of position "+(index+1)+" in the array: ");
            arr[index]= sc.nextInt();
            index++;
        }
        boolean increasing=increasing(arr);
        boolean decreasing=decreasing(arr);
        if(increasing || decreasing){
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
    }
    public static boolean increasing(int [] arr){
        int i=1;
        while (i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasing(int [] arr){
        int i=1;
        while (i< arr.length){
            if(arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
