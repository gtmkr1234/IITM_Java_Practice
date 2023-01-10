//delete all values in HashMap

package HashMaps;

import java.util.HashMap;

public class Main5 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();

        hm1.put(1,"Red");
        hm1.put(2,"Green");
        hm1.put(3,"Black");
        System.out.println("Values in hm1:"+hm1);

        hm1.clear();
        System.out.println("Final values in hm: "+hm1);
    }
}
