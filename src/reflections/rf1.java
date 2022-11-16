package reflections;

public class rf1 {
    public static void main(String[] args) {
        Integer obj = new Integer(55);
        Class<? extends Integer> a = obj.getClass();
        System.out.println("Class name is :");
        System.out.println(a);
    }
}

class r2{
    public static boolean isEqualClass(Object o1, Object o2){
        Class c1 = o1.getClass();
        Class c2 = o2.getClass();
        return (c1==c2);
    }

    public static void main(String[] args) {
        System.out.println(isEqualClass(new Integer(78), new Integer(45)));
    }
}
