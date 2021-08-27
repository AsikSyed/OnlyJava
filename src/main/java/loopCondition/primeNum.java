package loopCondition;

import java.util.Scanner;
//6. Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]-
public class primeNum {
    public static void main (String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int i =2;
        int num =0;

        String  primeNumbers = "";
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 2; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {

                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
}
