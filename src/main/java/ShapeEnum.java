public enum ShapeEnum  {
    FOURSQUARE, TRIANGLE, CIRCLE, TRAPEZOID;
    public static String getShape() {
        return ShapeEnum.values()[(int) (Math.random() * 4)].name();
    }
}
