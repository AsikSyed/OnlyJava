package basic;

import java.util.Scanner;

public class reverseNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to get reverse of those digit : ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}

