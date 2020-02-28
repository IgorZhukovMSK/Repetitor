public class Area {
    public static void main(String[] args) {

        Trigon trigon = new Trigon(5 , 6);
        Quadrate quadrate = new Quadrate(10);
        Rectangle rectangle = new Rectangle(8 , 9);

        System.out.println("площадь треугольника равна: " + trigon.area);
        System.out.println("площадь квадрата равна: " + quadrate.area);
        System.out.println("площадь прямоугольника равна: " + rectangle.area);

    }

    static class Trigon {  //треугольник
        double length;
        double width;

        double area;

        public Trigon(double length , double width) {

            area = (length * width) / 2;

        }
    }

    static class Quadrate { // квадрат

        double length = 10.0;
        double area;


        public Quadrate(double length) {
            area = Math.pow(length , 2);
        }
    }

    static class Rectangle {  // прямоугольник
        double length1;
        double width1;
        double area;

        public  Rectangle (double length1, double width1){

            area = length1 * width1;
        }
    }

}
