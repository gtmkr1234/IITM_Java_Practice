interface best{
    int v=45;
}
interface ex{
    int a =20;
}
class bf implements ex,best{

}


public class interface_examples {
    public static void main(String[] args) {
        bf ob = new bf();
        System.out.println(ob.a);
        System.out.println(ob.v);
    }
}
