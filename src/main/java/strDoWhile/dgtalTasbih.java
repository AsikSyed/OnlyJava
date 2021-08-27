package strDoWhile;

import java.util.Scanner;
//3. Write a program to make a digital tasbih where the program counts each time user press enter until press 0
public class dgtalTasbih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String tas;

        System.out.println("Keep Pressing Enter to count tasbih");
        do {
            System.out.println(count);
            count++;
            tas = input.nextLine();


        }

        while (tas.isEmpty());

    }
}
