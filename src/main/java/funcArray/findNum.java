package funcArray;

import java.util.Arrays;
import java.util.Scanner;
//2. Find the second largest number from an array by user input using function
public class findNum {
    public static void main(String[] args) {
        int[] num= new int[5];
        Scanner input= new Scanner(System.in);

        System.out.println("Enter 5 number to get 2nd large number: ");
        for (int i=0; i<num.length; i++){
            num[i]=input.nextInt();

        }
        dosort(num);

    }
    public static void dosort(int[] num){
        Arrays.sort(num);
        for(int j=0; j<num.length;j++){

            if(j==3){

        System.out.println(num[j]);
            }

        }
    }
}
