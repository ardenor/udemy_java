package sec7;

import sec6.Vehicle;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, String size, int doors, int engineCapacity) {
        super(name, size);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
