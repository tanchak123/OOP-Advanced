import java.util.Locale;

public class Circle<T> extends Shape {
    private double square;
    private double radius;

    public Circle (String color) {
        super("Circle", color);
        this.square = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getSquare()));
        this.radius = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getRadius()));
    }

    @Override
    public void draw() {
        System.out.println(" Shape: " + getName()
                + ", Square: " + square + " sqr. m.,"
                + " radius: " + radius + " units.,"
                + " color: " + getColor());
    }

    @Override
    public double getSquare() {
        return radius * Math.PI;
    }

    private double getRadius() {
        return Math.random() * 50;
    }

}
