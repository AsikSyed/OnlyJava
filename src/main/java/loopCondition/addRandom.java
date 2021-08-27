package loopCondition;
//3. Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
// If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,
// then user will get 0 point. Finally after 5 iteration, total score will be shown.
import java.util.Random;
import java.util.Scanner;

public class addRandom {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random rand = new Random();
        Random random = new Random();
        double sum;
        double ranSum;
        int score=0;

        for(int i=0; i<5; i++){
            int r = rand.nextInt(100) + 1;
            int r1 = random.nextInt(100) + 1;
            System.out.println("What is the sum of "+r +" and "+ r1);
            ranSum=r+r1;
            sum=scan.nextDouble();
            if(sum==ranSum){
                System.out.println(" Correct");
                score+=1;
            }
            else {
                System.out.println(" Incorrect");
                //score-=1;
            }

        }
        System.out.println("Your score is : "+score);
    }
}
