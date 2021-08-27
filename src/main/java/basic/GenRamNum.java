package basic;

import java.util.Scanner;

public class GenRamNum {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter Min  number: ");
        double min= num.nextDouble();
        System.out.println("Enter Max  number: ");
        double max= num.nextDouble();
        System.out.println((int)(Math.random()*(max-min)+min));





    }
}
