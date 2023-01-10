package HashMaps;
import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();
        HashMap<Integer,String> hm2 = new HashMap<>();

        hm1.put(1,"Red");
        hm1.put(2,"Green");
        hm1.put(3,"Black");
        System.out.println("Values in hm1 :" + hm1);

        hm2.put(4,"White");
        hm2.put(5,"Blue");
        hm2.put(6,"Orange");
        System.out.println("Values in hm2 :"+ hm2);

        hm2.putAll(hm1);
        System.out.println("Final values in hm2 are : \n" + hm2);
    }
}
