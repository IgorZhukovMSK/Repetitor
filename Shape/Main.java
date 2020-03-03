package Shape;

public class Main {

    public static void main(String[] args) {

        Ball ball = new Ball(1);
        System.out.println(ball.countVolume());

        Box box = new Box (10,20,5);

        Cylinder cylinder = new Cylinder(-1, 2);
        System.out.println (cylinder.countVolume());



    }
}
