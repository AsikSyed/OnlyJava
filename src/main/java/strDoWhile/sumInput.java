package strDoWhile;

import java.util.Scanner;
//1. Write a program to sum of digits of a number by taking from user input.
public class sumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the to get sum of those digit : ");
        int number = sc.nextInt();
                int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            sum +=rem;
        }
        System.out.println(sum);
    }
}

