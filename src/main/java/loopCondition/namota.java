package loopCondition;

import java.util.Scanner;
//5. Take a number as input from the user. Now write a program to show table of the given numbers. Output will be shown like this:
public class namota {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        int mul;
        System.out.println("Enter your number of multiplier : ");
        n=sc.nextInt();
        for(int i=1; i<=10; i++){
            mul=i*n;
            System.out.println(n+"*"+i+"="+mul);
        }
    }
}
