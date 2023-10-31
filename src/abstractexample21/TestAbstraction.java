package abstractexample21;

public class TestAbstraction {
    public static void main(String[] args) {
        // Creating an instance of Circle (subclass) but using the reference of Shape (superclass)
        Shape s = new Circle();
        s.draw(); // Calls the draw method of Circle

        // You can also create an instance of Rectangle
        Shape r = new Rectangle();
        r.draw(); // Calls the draw method of Rectangle
    }
}
