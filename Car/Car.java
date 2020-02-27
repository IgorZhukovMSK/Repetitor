package Car;

/*
Создать класс "Автомобиль", придумать для него поля и переопределить в нем методы equals, toString
 */


public class Car {

private String name;
private String color;
private int speedMax;


public Car (String name, String color, int speedMax){

    this.name = name;
    this.color = color;
    this.speedMax = speedMax;
    }


    public boolean equals() {

        if (speedMax > 100) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {

    System.out.println ("Марка машины: " + name + ", " + "Цвет машины: " + color + ", " + "Максимальная скорость: " + speedMax);

        return super.toString();
    }
}

