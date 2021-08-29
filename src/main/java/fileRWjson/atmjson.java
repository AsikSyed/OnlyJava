package fileRWjson;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class atmjson {
    public static void main(String[] args) throws IOException, ParseException {

        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int w_pin = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(" Please enter your Pin: ");
            pin = sc.nextInt();
            if (pin == 1234) {

                getpermit();
                int t;
                System.out.println("Do you want to transit?");
                System.out.println(" Press 1 to continue ");
                System.out.println(" Press 0 to Exit ");
                t = sc.nextInt();

                if (t == 1) {
                    getpermit();
                } else if (t == 0) {
                    System.exit(0);
                }

            } else if (i < 3) {
                System.out.println("Invalid pin. Please try again");
                w_pin += 1;
                continue;
            }
        }
        if (w_pin == 3) {
            System.out.println("You have entered wrong PIN more than 3 times. Card has blocked");
        }
    }

    public static void getpermit() throws IOException, ParseException {
        int n;
        long wid;

        Scanner sc = new Scanner(System.in);
        do {
            JSONParser jparser = new JSONParser();
            Object obj = jparser.parse(new FileReader("atm.json"));
            JSONObject balanceObject = (JSONObject) obj;
            long balance = (long) balanceObject.get("Balance");

            System.out.println("Please select your option");
            System.out.println("Press 1 for withdraw");
            System.out.println("Press 2 for check balance");
            System.out.println("Press 3 for exit");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter your amount : ");
                    wid = sc.nextInt();
                    if (wid <= balance && wid % 500 == 0) {
                        System.out.println("collect your money");
                        System.out.println("Thank You.");
                        long balance2 = balance - wid;
                        System.out.println("Current balance :" + balance2);
                        JSONObject jsob = new JSONObject();
                        jsob.put("Balance", balance2);
                        FileWriter fw = new FileWriter("atm.json");
                        fw.write(jsob.toJSONString());
                        fw.flush();
                        fw.close();
                        break;
                    } else if (wid <= balance && wid % 500 != 0) {
                        System.out.println("Balance is not divisible by 500. Please try with another amount");
                        continue;
                    } else if (wid > balance && wid % 500 == 0) {
                        System.out.println(" Not enough balance. Please input valid amount");
                        continue;
                    }

                case 2:
                    System.out.println("balance : " + balance);
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
        while (n != 3);
    }
}
