package Car;

/*
Создать класс "Автомобиль", придумать для него поля и переопределить в нем методы equals, toString
 */


public class Car {

    private String name;
    private String color;
    private int speedMax;


    public Car(String name, String color, int speedMax) {

        this.name = name;
        this.color = color;
        this.speedMax = speedMax;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }


//    public boolean equals(Object obj) {
//
//        return name == obj.name && color == obj.color && speedMax == obj.speedMax;
//    }

//    public boolean equals(Object obj) {
//
//        return name == obj.name && color == obj.color && speedMax == obj.speedMax;
//    }


    public String toString() {

        return "Марка машины: " + name + ", " + "Цвет машины: " + color + ", " + "Максимальная скорость: " + speedMax;

    }
}

