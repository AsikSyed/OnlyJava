package strDoWhile;
//4. 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
// Find total price and total quantity using regular expression.
public class strHandling {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk ";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
       // System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);

        double price1=Double.parseDouble(arr[1]);
        double price2=Double.parseDouble(arr[3]);
        double price3=Double.parseDouble(arr[5]);

        double piece1=Double.parseDouble(arr[0]);
        double piece2=Double.parseDouble(arr[2]);
        double piece3=Double.parseDouble(arr[4]);

        double total1=piece1+piece2+piece3;
        double total2=price1+price2+price3;
        System.out.println("Total price "+total2);
        System.out.println("Total piece "+total1);

    }
}
