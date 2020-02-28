package Shape;

public class Pyramid extends ShapeSizes {

    private double height;
    private double area;

    public Pyramid(double area, double height) {
        super();
        this.height = height;
        this.area = area;
    }

    public double countVolume() {

        return ((double) 1 / 3) * area * height;

    }
}

