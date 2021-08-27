package funcArray;

import java.util.*;
//Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and
// each time generate 3 notes randomly and show their summation.

public class randmHashmap {


    public static int ranhash() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 5);
        map.put("C", 10);
        map.put("D", 20);
        map.put("E", 50);
        map.put("F", 100);
        map.put("G", 200);
        map.put("H", 500);
        map.put("I", 1000);


        Set<String> keySet = map.keySet();
        List<String> keyList = new ArrayList<>(keySet);

        int size = keyList.size();
        int randIdx = new Random().nextInt(size);

        String randomKey1 = keyList.get(randIdx);
        //        String randomKey2 = keyList.get(randIdx);
//        Integer randomValue2 = map.get(randomKey2);
//        String randomKey3 = keyList.get(randIdx);
//        Integer randomValue3 = map.get(randomKey3);
        int a = map.get(randomKey1);




       // System.out.println(b + "Tk ");


        //int total=randomValue1 +randomValue2 +randomValue3;
        //System.out.println("Total= "+total);

        return a;
    }

    public static void main(String[] args) {

        int x= ranhash();
        int y= ranhash();
        int z= ranhash();
        System.out.println(x + " Tk, "+y+" Tk, "+z+" Tk");

        int total=x+y+z;
        System.out.println("Total = "+ total +" Tk.");


    }
}