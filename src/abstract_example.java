abstract class cal{
    abstract int add(int a,int b);
    abstract int sub(int a, int b);
    abstract  int div(int a, int b);
    abstract int mul(int a,int b);
}

public class abstract_example extends cal {
    public int add(int c,int d){
        return c+d;
    }
    public int sub(int a, int b) {
        return a-b;
    }

    public int div(int a, int b) {
        return a/b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        abstract_example ob = new abstract_example();
        System.out.println(ob.add(5,6));
        System.out.println(ob.div(5,2));
    }

}
