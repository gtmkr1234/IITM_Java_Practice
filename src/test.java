////public class test {
////    public static void main(String args[])
////    {
////        int x=1;
////        if(false) { System.out.println(x); }
////        else { System.out.println("True"); }
////    }
////}
////class A {
////    public void display( ){
////        System.out.print("Hii ");
////    }
////}
////class B extends A{
////    public void display(String s){
////        display();
////        System.out.println(s);
////    }
////    public static void main(String[] args) {
////        A a = new B( );
////        // Line 1
////        ((B)a).display("Ram");
////    }
////}
////
////
////class Bird{
////    public void fly(){
////        System.out.println("it can fly");
////    }
////}
////class Duck extends Bird{
////    public void swim(){
////        System.out.println("it can swim");
////    }
////}
////////class FClass{
//////    public static void doIt(Bird b){
//////        b.fly();
//////        if(b instanceof Duck)
//////            ((Duck) b).swim();
//////
//////    }
//////    public static void main(String[] args){
//////        Duck d = new Duck();
//////        doIt(d);
//////    }
//////}
////
////
//// class Shape{
////    public void area(){
////        System.out.println("area is unknown");
////    }
////    public void volume(){
////        System.out.println("volume is unknown");
////    }
////}
//// class Rectangle extends Shape{
////    public void area(){
////        System.out.println("area of Rectangle");
////    }
////}
//// class Cube extends Shape{
////    public void area(){
////        System.out.println("area of Cube");
////    }
////    public void volume(){
////        System.out.println("volume of Cube");
////    }
////}
////// class FClass{
//////    public static void compute(Shape s){
//////        s.area();
//////        s.volume();
//////    }
//////    public static void main(String[] args){
//////        Rectangle r = new Rectangle();
//////        Cube c = new Cube();
//////        compute(r);
//////        compute(c);
//////    }
////}
//
//
//
//class Employee{
//    private int empid;
//    private String name;
//
//    public Employee(int empid_, String name_){
//        empid = empid_;
//        name = name_;
//    }
//    public Employee(){
//        this(0, "unknown");
//    }
//    public void print(){
//        System.out.print(empid + " : " + name + " : ");
//    }
//}
//class Manager extends Employee{
//    private String department;
//
//    public Manager(int empid_, String name_, String department_){
//        super(empid_, name_);
//                department = department_;
//    }
//    public void print(){
//        super.print();
//        System.out.println(department);
//    }
//}
// class FClass{
//    public static void main(String[] args){
//        Manager m = new Manager(101, "Nutan", "HR");
//        m.print();
//    }