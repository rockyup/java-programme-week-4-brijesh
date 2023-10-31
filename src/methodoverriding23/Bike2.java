package methodoverriding23;

class Bike2 extends Vehicle {
    // Defining the same method as in the parent class but with an override
    public void run1() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike2 obj = new Bike2(); // Creating an object
        obj.run(); // Calling the run method
        obj.run1();
    }
}