package reflections;
import java.lang.reflect.*;
import java.util.Arrays;

public class rf1 {
    Integer a;
    String name;
    public rf1(){
        a=15;
        name = "Krishna";
    }

}
class r2{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        rf1 obj = new rf1();
        Class c= obj.getClass();
        Constructor[] cr = c.getConstructors();
        Method[] m = c.getMethods();
        Field[] f = c.getFields();
        System.out.println("Constructors are:-");
        for(Constructor rs: cr){
            System.out.println(rs);
        }
        System.out.println("\n Methods are :-");
        for(Method u : m){
            System.out.println(u);
        }
        System.out.println("\n fields are as follows:-");
        for(Field fld: f){
            System.out.println(fld);
        }

        System.out.println(m[0].invoke(5,4));
    }
}
