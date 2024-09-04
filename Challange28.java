//Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

class Challange28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");

        int num=sc.nextInt();
        System.out.println("The multiplication table of "+num + " is=");
        int start=1;

        while(start<=10){

            int result=num*start;

            System.out.println(num + " X " + start + " = " + result);
                    start++;
        }
    }
}
