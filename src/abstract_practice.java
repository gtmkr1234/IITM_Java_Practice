interface Areas{
    void area(float a, float b);
}

class Triangle implements Areas{
    public void area(float a, float b){
        System.out.println("RAea is " + 0.5*a*b);
    }
}
class Rect implements Areas{
    public void area(float a, float b){
        System.out.println(a*b);
    }
}


public class abstract_practice {
    public static void main(String[] args) {
        Areas triangle = new Triangle();
        triangle.area(5,4);
        Areas ractangle = new Rect();
        ractangle.area(5,4);
    }
}
