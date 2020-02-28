package Shape;

abstract public class ShapeSizes {

    protected double length;
    protected double width;
    protected double height;
    protected double radius;
    protected double area;


    public ShapeSizes() {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Вы ввели не корректные данные");
        } else if (radius <= 0 || height <= 0){
            throw new IllegalArgumentException("Вы ввели не корректные данные");
        }else if (height <= 0){
            throw new IllegalArgumentException("Вы ввели не корректные данные");
        }else if (area <= 0){
            throw new IllegalArgumentException("Вы ввели не корректные данные");
        }
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.area = area;
    }







//    public ShapeSizes(double length, double width, double height) {
//        if (length <= 0 || width <= 0 || height <= 0) {
//            throw new IllegalArgumentException("Вы ввели не корректные данные");
//        }
//        this.length = length;
//        this.width = width;
//        this.height = height;
//    }
//
//
//    public ShapeSizes(double radius, double height) {
//        if (radius <= 0 || height <= 0) {
//            throw new IllegalArgumentException("Введите корректные данные");
//        }
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public ShapeSizes(double height) {
//        if (height <= 0) {
//            throw new IllegalArgumentException("Вы ввели не корректные данные");
//        }
//        this.height = height;
//    }

}





