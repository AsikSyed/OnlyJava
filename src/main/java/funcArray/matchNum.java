package funcArray;

import java.util.Scanner;

//4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
//Given array is: {10,5,2,3,2,7,7,15,10}
public class matchNum {
    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        System.out.println("Enter a Number to check match or not");
        //boolean check;
        getchek(arr);

    }

    public static int getchek(int[] arr) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("User Input: " + num);
                System.out.println("Position : " + i);
                check = true;
                break;
            }
        }
        if (check != true) {
            System.out.println("-1");
            return -1;

        }


        return -1;

    }


}

