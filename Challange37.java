//Create a program to check if a number is an Armstrong number.
import java.util.Scanner;
class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("It is a armstrong number.");
        }
        else {
            System.out.println("It is not a armstrong number.");
        }
    }
    public static boolean isArmstrong(int num){
        int sum=0;
        int temp=num;
        while (num>0){
            sum=sum+((num%10)*(num%10)*(num%10));
            num=num/10;
            if(sum==temp){
                return true;
            }
        }
        return false;
    }
}