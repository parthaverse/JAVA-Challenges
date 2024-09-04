//Create a program to find maximum & minimum element in an array.
import java.util.Scanner;
public class Challange42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size= sc.nextInt();
        int [] arr=new int[size];
        int index=0;
        while (index< arr.length){
            System.out.print("Enter the element for the position "+(index+1)+" int the array : ");
            arr[index]= sc.nextInt();
            index++;
        }
        int maxNo= maxNo(arr);
        int minNo= minNo(arr);
        System.out.println("The maximum number in the array is "+maxNo);
        System.out.println("The minimum number in the array is "+minNo);
    }
    public static int maxNo(int[]arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=arr[0];
        int i=0;
        while (i<arr.length){
            if(max<arr[i]){
                max=arr[i];
            }
        i++;
        }
        return max;
    }
    public static int minNo(int[]arr) {
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i<arr.length){
            if(min>arr[i]){
                min=arr[i];
            }
            i++;
        }
        return min;
    }

}
