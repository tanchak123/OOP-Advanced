import java.util.Locale;

public class Foursquare extends Shape {
    private double square;
    private double diagonal;
    private double side;

    public Foursquare (String color) {
        super("Foursquare", color);
        this.diagonal = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getDiagonal()));
        this.side = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getSide()));
        this.square = Double.parseDouble(String.format(Locale.ENGLISH,"%(.2f",getSquare()));
    }

    @Override
    public void draw() {
        System.out.println(" Shape: " + getName()
                + ", Square: " + square + " sqr. m., "
                + "Diagonal: " + diagonal + " m., "
                + "Side: " + side + " m., "
                + "Color: " + getColor());
    }

    @Override
    public double getSquare() {
        return diagonal * side;
    }

    private double getDiagonal() {
        return Math.random() * 49;
    }
    private double getSide() {
        return Math.random() * 20;
    }
}
