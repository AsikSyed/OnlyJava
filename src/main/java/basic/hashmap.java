package basic;

import java.util.*;

public class hashmap {
//    *5. Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and each time generate 3 notes randomly and show their summation.
//    Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk*/


    public static int getRandomKey() {
        HashMap<Integer, String> money = new HashMap<>();
        money.put(2, "Tk");
        money.put(5, "Tk");
        money.put(10, "Tk");
        money.put(20, "Tk");
        money.put(50, "Tk");
        money.put(100, "Tk");
        money.put(200, "Tk");
        money.put(500, "Tk");
        money.put(1000, "Tk");

        Set<Integer> keySet = money.keySet();
        List<Integer> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randId = new Random().nextInt(size);

        return (keyList.get(randId));
    }

    public static void main(String[] args) {

        int randomKeyOne = getRandomKey();
        int randomKeyTwo = getRandomKey();
        int randomKeyThree = getRandomKey();
        System.out.println("Output: " + randomKeyOne + "Tk, " + randomKeyTwo + "Tk, " + randomKeyThree + "Tk. " + "Total: " + (randomKeyOne + randomKeyTwo + randomKeyThree) + "Tk");
    }

}
