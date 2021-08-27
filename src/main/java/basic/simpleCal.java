package basic;

import java.util.Scanner;

public class simpleCal {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Simple calculator is running now");
        System.out.println("Enter your number");
        double a = val.nextDouble();
        System.out.println("Enter your number");
        double b= val.nextDouble();
        System.out.println("Enter your number");
        double c= val.nextDouble();
        double sum=(a+b+c);
        double avg= ((a+b+c)/3);
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+avg);
        }

    }

