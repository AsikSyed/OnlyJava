package basic;

import java.util.Scanner;

public class valPow {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.println("Enter 1st value :");
        double a= val.nextDouble();
        System.out.println("Enter 2nd value :");
        double b= val.nextDouble();
        double sum=(a+b);
        System.out.println(Math.pow(sum,2));

    }
}
