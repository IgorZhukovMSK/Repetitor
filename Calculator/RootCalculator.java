package Calculator;

public class RootCalculator {


    private double num, root;

    public RootCalculator(double num, double root) {
        this.num = num;
        this.root = root;
    }

    double getRoot() {
        return Math.pow(num, 1.0 / root);
    }
}
