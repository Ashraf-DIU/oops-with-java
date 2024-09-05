import java.util.*;
import bank;

class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
//single line inheritance
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTri extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class OOPS_2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
    }
}
