public class Assignment1 {
    public static void main(String[] args){
        Car car = new Car("Tata", "SUVs", 2022, 200);
        car.drive();

        Bike bike = new Bike("Honda", " Honda Shine", 2023, 120);
        bike.drive();
    }
}
class Vehicle{
    String make;
    String model;
    int year;
    int maxSpeed;
    void drive(){

    }

    public Vehicle(String make, String model, int year, int maxSpeed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

}

class Car extends Vehicle{
    public Car(String make, String model, int year, int maxSpeed){
        super(make, model,year, maxSpeed);
    }

    void drive(){
        System.out.println(make + "" + model + "Car is Driving.");
    }

}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maxSpeed) {
        super(make, model, year, maxSpeed);
    }

    void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}
