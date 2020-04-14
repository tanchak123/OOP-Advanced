    abstract class Shape {
    private String color;
    private double square;
    private String name;
    public abstract void draw();
    public abstract double getSquare();

    Shape(String name, String color){
        this.color = color;
        this.name = name;
        this.square = getSquare();
    }

    public String getColor() {
            return color;
    }

    public String getName() {
            return name;
    }
}
