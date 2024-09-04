//Create a program to find the Least Common Multiple (LCM) of two numbers.
import java.util.Scanner;
public class Challange32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lcm=lcmCalculation(num1,num2);
        System.out.println("the lcm is="+lcm);

    }
    public static int lcmCalculation(int num1,int num2){
        int i=1;
        while (true){    //while(i<=num2)
            int last=num1*i;
            if(last % num2 == 0){
                return last;
            }
            i++;
        }
        //return 0; if we use while(i<=num2){}
    }
}
