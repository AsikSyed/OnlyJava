package strDoWhile;

import java.util.Scanner;
//2. Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]
public class prmNumDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 2;
        int num = 0;

        String primeNumbers = "";


        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        do {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {

                primeNumbers = primeNumbers + i + " ";
            }
            i++;
        }


        while (i <= n);
        {
        }
        System.out.println("Prime numbers from 2 to n are :");
        System.out.println(primeNumbers);


    }

}








