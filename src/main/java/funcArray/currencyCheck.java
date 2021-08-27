package funcArray;
//6. Write a program that will show minimum number of currency notes to sum of given amount

import java.util.*;
import java.lang.*;

public class currencyCheck {
    public static void main(String argc[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total Amount");
        int amount = input.nextInt();

        checkCurrency(amount);
    }


    public static void checkCurrency(int amount) {
        int[] notes = new int[]{1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] Counter = new int[10];


        for (int i = 0; i < 10; i++) {
            if (amount >= notes[i]) {
                Counter[i] = amount / notes[i];
                amount = amount - Counter[i] * notes[i];
            }
        }


        System.out.println("Note Variant :");
        for (int i = 0; i < 10; i++) {
            if (Counter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + Counter[i]);
            }
        }
    }


}
