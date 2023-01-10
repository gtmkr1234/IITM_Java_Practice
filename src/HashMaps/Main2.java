package HashMaps;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"Red");
        hm.put(2,"Green");
        hm.put(3,"Blue");
        hm.put(4,"White");
        hm.put(1,"Blue");

        for(Map.Entry x: hm.entrySet()){
            System.out.println(x.getKey()+" "+ x.getValue());
        }
    }
}
