import java.util.Locale;

public class Triangle extends Shape {
    private double height;
    private double lowerBase;
    private double square;

    public Triangle(String color) {
        super("Triangle" , color);
        this.height = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getHeight()));
        this.lowerBase = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getLowerBase()));
        this.square = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getSquare()));
    }

    @Override
    public void draw() {
        System.out.println(" Shape: " + getName()
                + ", Square: " + square + " sqr. m.,"
                + " Height: " + height + " m."
                + " lowerBase: " + lowerBase + " m.,"
                + " Color: " + getColor());
    }

    @Override
    public double getSquare() {
        return lowerBase * height;
    }

    private double getHeight() {
        return Math.random() * 20;
    }

    private double getLowerBase() {
        return Math.random() * 20;
    }
}
