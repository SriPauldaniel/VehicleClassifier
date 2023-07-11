class Vehicle {
    String vehicle;
    public void Start() {
        System.out.println(vehicle + " Started");
    }
    public void Stop() {
        System.out.println(vehicle + " Stopped");
    }
}

class Motorcycle extends Vehicle {
    public void Start() {
        super.vehicle = "Car";
        super.Start();
    }
    

    public void Stop() {
        super.vehicle = "Car";
        super.Stop();
    }
}

class Car extends Vehicle{
    public void Start() {
        super.vehicle = "Motorcycle";
        super.Start();
    }
    

    public void Stop() {
        super.vehicle = "Motorcycle";
        super.Stop();
    }
}
public class VehicleClassifier {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.Start();
        car.Stop();
        motorcycle.Start();
        motorcycle.Stop();
    }
}
