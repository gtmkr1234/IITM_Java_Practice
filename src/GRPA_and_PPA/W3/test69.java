package GRPA_and_PPA.W3;

import java.util.Scanner;

public class test69 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        while (a-- >0){
            long size = s.nextLong();
            long [] arr = new long[Math.toIntExact(size)];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                min = Math.toIntExact(Math.min(min, arr[i]));
            }
            if(min==arr[0]){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }

        }
    }
}
