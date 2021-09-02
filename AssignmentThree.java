
public class AssignmentThree {

    interface Shape {

        public double calculateArea();

        public void display();
    }

    public static class Rectangle implements Shape {

        int width;
        int height;
        public Rectangle(int a, int b){
            this.width = a;
            this.height = b;
        }
        @Override
        public double calculateArea() {
            return (double)(this.width * this.height);
        }
        
        // Prints out the area of the Rectangle.
        @Override
        public void display() {
            double area = calculateArea();

            System.out.println("The calculated area for the Rectangle was: "+area);
            
        }

    }

    public static class Circle implements Shape {

        double radius;

        public Circle(int r){
            this.radius = r;
        }
        @Override
        public double calculateArea() {
            return Math.PI * (this.radius * this.radius);
        }

        @Override
        public void display() {
            double area = calculateArea();

            System.out.println("The calculated area for the Circle was: "+area);
        }

    }

    public static class Triangle implements Shape {

        int base;
        int height;

        public Triangle(int b, int h) {
            this.base = b;
            this.height = h;

        }

        @Override
        public double calculateArea() {
            return 0.5 * this.base * this.height;
        }

        @Override
        public void display() {
            double area = calculateArea();

            System.out.println("The calculated area for the Triangle was: "+area);
            
        }

        
    }

    public static void main(String [] args) {
        int r = 4;
        Circle c = new Circle(r);
        c.display();

        int b = 10;
        int h = 5;
        Triangle t = new Triangle(b,h);
        t.display();

        int w = 7;
        int l = 15;
        Rectangle rect = new Rectangle(w,l);
        rect.display();



    }
    
}
