package loopCondition;

import java.util.Scanner;
//2.Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)---
public class cgpaCal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" Enter your course-1 mark :");
        double course1= input.nextDouble();
        System.out.println(" Enter your course-2 mark :");
        double course2= input.nextDouble();
        System.out.println(" Enter your course-3 mark :");
        double course3= input.nextDouble();
        System.out.println(" Enter your course-4 mark :");
        double course4= input.nextDouble();
        double avg=((course1+course2+course3+course4)/4);
        double point;
        if(avg<60){
            point=0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'F' ");
        }
        else if(avg>=60 && avg<63){
            point=1.0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'D' ");
        }
        else if(avg>=63 && avg<67){
            point=1.3;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'D+' ");
        }
        else if(avg>=67 && avg<70){
            point=1.7;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'C-' ");
        }
        else if(avg>=70 && avg<73){
            point=2.0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'C' ");
        }
        else if(avg>=73 && avg<77){
            point=2.3;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'C+' ");
        }
        else if(avg>=77 && avg<80){
            point=2.7;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'B-' ");
        }
        else if(avg>=80 && avg<83){
            point=3.0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'B' ");
        }
        else if(avg>=83 && avg<87){
            point=3.3;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'B+' ");
        }
        else if(avg>=87 && avg<90){
            point=3.7;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'A-' ");
        }
        else if(avg>=90 && avg<97){
            point=4.0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'A' ");
        }
        else if(avg>=97 && avg<=100){
            point=4.0;
            System.out.println("your Grade point is : "+point);
            System.out.println("And Grade is 'A+' ");
        }




    }
}
