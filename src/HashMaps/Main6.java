package HashMaps;
import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();

        hm1.put(1,"Red");
        hm1.put(2,"Green");
        hm1.put(3,"Black");
        System.out.println("Values in hm1:"+hm1);
        boolean ans = hm1.isEmpty();
        System.out.println(ans);
        System.out.println(hm1.isEmpty());

        hm1.clear();
        System.out.println("Final values in hm: "+hm1);
        System.out.println(hm1.isEmpty());
    }
}
