public class AreaV1 {
    public static void main(String[] args) {


        System.out.println("площадь треугольника равна: " + trigonArea(3.0 , 8.0));
        System.out.println("площадь квадрата равна: " + quadrateArea(6.0));
        System.out.println("площадь прямоугольника равна: " + rectangleArea(6.0 , 7.0));

    }

        public static double trigonArea (double length , double width) {
         double area = (length * width) / 2;
            return  area;

        }


           public static double quadrateArea (double length) {
           double area = Math.pow(length , 2);
           return area;
        }


        public static double rectangleArea (double length1, double width1){

            double area = length1 * width1;
            return area;
        }
    }


