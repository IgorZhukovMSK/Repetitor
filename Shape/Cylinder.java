package Shape;

public class Cylinder extends ShapeSizes{

    private double radius;
    private double height;


    public Cylinder( double radius, double height) {
        super ();
        this.radius = radius;
        this.height = height;
    }

    public double countVolume() {
        return 3.14 * (Math.pow(radius, 2) * height);

    }
}

