import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How much random shapes do you want?");
        Scanner asker = new Scanner(System.in);
        Shape[] shapes = new Shape[asker.nextInt()];
        for (int i = 0; i < shapes.length; i++) {
            switch (ShapeEnum.getShape()) {
                case "FOURSQUARE":
                    Foursquare foursquare = new Foursquare(Color.getRandomColor());
                    shapes[i] = foursquare;
                    foursquare.draw();
                    break;
                case "TRIANGLE":
                    Triangle triangle = new Triangle(Color.getRandomColor());
                    shapes[i] = triangle;
                    triangle.draw();
                    break;
                case "CIRCLE":
                    Circle circle = new Circle(Color.getRandomColor());
                    shapes[i] = circle;
                    circle.draw();
                    break;
                case "TRAPEZOID":
                    Trapezoid trapezoid = new Trapezoid(Color.getRandomColor());
                    shapes[i] = trapezoid;
                    trapezoid.draw();
                    break;
            }
        }
    }
}
