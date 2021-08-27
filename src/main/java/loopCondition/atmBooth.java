package loopCondition;

import java.util.Scanner;
//4. Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance 2. Withdraw Money)
public class atmBooth {

        public static void main(String[] args) {
            int balance = 10000;
            Scanner sc = new Scanner(System.in);
            int pin = 1234;
            int wid;
            int w_pin=0;


            for(int i=0; i<3; i++){
                System.out.println(" Please enter your Pin: ");
                pin= sc.nextInt();

                if(pin==1234){


                    System.out.println("Please select your option");
                    System.out.println("Press 1 for withdraw");
                    System.out.println("Press 2 for check balance");
                    System.out.println("Press 3 for exit");
                    int n = sc.nextInt();

                    switch (n) {
                        case 1:
                            System.out.println("Enter your amount : ");
                            wid= sc.nextInt();
                            if (wid<=balance && wid % 500==0) {

                                balance-= wid;
                                System.out.println("collect your money");
                                System.out.println("Thank You.");
                                break;
                            }
                            else if(wid<=balance && wid % 500!=0) {
                                System.out.println("Balance is not divisible by 500. Please try with another amount");
                                continue;
                            }
                            else if(wid>balance && wid % 500==0){
                                System.out.println(" Not enough balance. Please input valid amount");
                                continue;
                            }


                        case 2:
                            System.out.println("balance : "+balance);
                            System.out.println(" ");
                            System.out.println("Thank You.");
                            break;

                        case 3:
                            System.out.println("You are exited");
                            System.out.println("Thank You.");
                            System.exit(0);
                    }
                    break;

                }
                else if(i<3){
                    System.out.println("Invalid pin. Please try again");
                    w_pin+=1;
                    continue;
                }


            }

            if(w_pin==3) {
                System.out.println("You have entered wrong PIN more than 3 times. Card has blocked");
            }

        }
    }

