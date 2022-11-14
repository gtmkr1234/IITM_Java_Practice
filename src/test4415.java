import java.util.Scanner;

public class test4415 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int test = s.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        while(test-- > 0 ) {
            int l = s.nextInt();
            int r = s.nextInt();
            boolean zero = false;
            for (int i = l-1; i <= r-1; i++) {
                if(arr[i] == 0){
                    zero = true;
                    break;
                }
            }
            int res = 0;
            if((l-r)>1 && l+r%2==0){
                res = 1;
            }
            else if((l-r)>1 && l+r%2!=0){
                res =0 ;
            }
            else if((l-r)==1){
                res = -1;
            }
            if(zero){
                res++;
            }
            System.out.println(res);
        }
    }
}
