package Shape;

// реализовать метод подсчета объема

public class Box extends ShapeSizes{

    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {

        super();

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double countVolume() {
        return length * width * height;
    }
}
