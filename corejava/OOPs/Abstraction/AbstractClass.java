package basic.java.course;
abstract class Shape{
    void displayShape(){
        System.out.println("Displaying Shape");
    }
}
class Circle extends Shape{
    void displayCircle() {
        System.out.println("This is circle shape");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle circle =new Circle();
       // Shape shape =new Shape(); //'Shape' is abstract; cannot be instantiated
        circle.displayShape();
        circle.displayCircle();
    }
}
