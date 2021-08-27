package strDoWhile;

import java.util.Scanner;

public class strHtml {
    public static void main(String[] args) {
        String str = " <html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html> ";
        str=str.substring(58,73);
        System.out.println(str);
       // str = str.replaceAll("[^\\d]", " ");
       // str = str.trim();
       // str = str.replaceAll(" +", " ");
       // String[] arr = (str.split(" "));
       // System.out.println(arr[0]);
    }
}
