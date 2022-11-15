package reflections;

public class rf1 {
    public static void main(String[] args) {
        Integer obj = new Integer(55);
        Class<? extends Integer> a = obj.getClass();
        System.out.println("Class name is :");
        System.out.println(a);
    }
}
