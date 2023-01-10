package HashMaps;

import java.util.HashMap;

public class Main7 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();

        hm1.put(1,"Red");
        hm1.put(2,"Green");
        hm1.put(3,"Black");
        System.out.println("Original Map = "+ hm1);
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2 = (HashMap) hm1.clone();
        System.out.println("cloned is "+ hm2);
    }
}
