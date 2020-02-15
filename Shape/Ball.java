package Shape;

public class Ball extends ShapeSizes{

    private double radius;

    public Ball(double radius) {
//        if (super (radius) <= 0) {
//            throw new IllegalArgumentException("Введите корректные данные");
//        }
        super () ;
        this.radius = radius;

    }

    public double countVolume() {
        return ((double) 4 / 3) * 3.14 * Math.pow(radius, 3);
    }
}
