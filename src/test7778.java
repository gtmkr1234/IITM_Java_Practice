import java.util.Scanner;

public class test7778 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        while (a-- >0){
            int n = s.nextInt();
            int c = (n+1)/2;
            System.out.println(c);
            for (int i = 0; i < c; i++) {
                System.out.println((i*3)+1 + " " + ((n*3)-(i*3+1)+1));
            }
        }
    }
}
