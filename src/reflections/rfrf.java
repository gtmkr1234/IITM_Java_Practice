package reflections;

public class rfrf {
}
class Vehicle{
}
class Car extends Vehicle{
}
class Sample {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle();
        Vehicle vehicle2=new Car();
        Class c1=vehicle1.getClass();
        Class c2=vehicle2.getClass();
//        if(c1==c2){
//            System.out.println("Both objects are equal....");
//        }
//        else{
//            System.out.println("Both objects are not equal...");
//        }
        System.out.println(c1);
        System.out.println(c2);
    }}
