public enum Color {
    GREEN,
    BLUE,
    WHITE,
    YELLOW,
    RED,
    ORANGE;
    public static String getRandomColor() {
        return Color.values()[(int) (Math.random() * 6)].name();
    }
}
