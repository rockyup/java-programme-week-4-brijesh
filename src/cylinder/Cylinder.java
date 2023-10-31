package cylinder;

  public class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius); // Call the constructor of the Circle class
            this.height = (height < 0) ? 0 : height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea() * height;
        }
    }

