package loopCondition;
//1. Write a program that takes a year from user and print whether that year is a leap
//year or not-------------------------------2

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter a Year : ");
        int year= input.nextInt();
        boolean leap;
        if (year % 4==0){
            if(year % 100==0){
                if(year % 400==0){
                    leap=true;
                }
                else leap=false;

            }
            else leap=true;
        }
        else {
            leap = false;

        }
        if(leap==true)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");


    }
}
