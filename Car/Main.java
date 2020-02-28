package Car;

public class Main {

    public static void main (String [] args){

        Car car1 = new Car("Nissan", "green",150);
        System.out.println(car1.equals());

        if (car1.equals()){
            System.out.println("Спортивная машина");
        }

        car1.toString();
    }

}
