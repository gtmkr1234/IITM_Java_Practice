import java.util.Scanner;

public class test897 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        while (a-- >0){
            int size = s.nextInt();
            int [] arr = new int[size];
            long sum = 0;
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                sum += arr[i];
            }
            System.out.println(Math.abs(sum));
        }
    }
}
