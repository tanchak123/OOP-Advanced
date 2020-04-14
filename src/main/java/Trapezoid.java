import java.util.Locale;

public class Trapezoid extends Shape {
    private double upperSide;
    private double downSide;
    private double height;
    private double square;

    public Trapezoid(String color) {
        super("Trapezoid", color);
        this.upperSide = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getUpperSide()));
        this.downSide = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getDownSide()));
        this.height = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getHeight()));
        this.square = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getSquare()));

    }

    @Override
    public void draw() {
        System.out.println(" Shape: " + getName()
                + ", Square: " + square + " sqr. m."
                + ", Upper side: " + upperSide + "m."
                + ", Down Side: " + downSide + "m. ,"
                + " Height: " + height + " m.,"
                + " Color: " + getColor());
    }

    @Override
    public double getSquare() {
        return (upperSide + downSide)/2 * height;
    }

    public double getUpperSide() {
        return Math.random() * 15;
    }

    public double getDownSide() {
        return Math.random() * 13;
    }

    public double getHeight() {
        return Math.random() * 20;
    }

}
