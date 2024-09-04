//Create a program to find the sum and average of all elements of an array.
import java.util.Scanner;
class Challange40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Enter the element for position " + (index + 1) + ": ");
            arr[index] = sc.nextInt();
            index++;
        }
        double sum = sum(arr);
        double average = average(arr);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
    public static double sum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] arr){
        double sum=sum(arr);
        return sum/arr.length;
    }
}
