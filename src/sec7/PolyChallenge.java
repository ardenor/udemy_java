package sec7;

public class PolyChallenge {
    public static void main(String[] args) {
        Honda honda = new Honda("Civic", 4);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
        System.out.println(honda.getName());
    }
}

class PolyCar{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public PolyCar(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "PolyCar engine started";
    }
    public String accelerate(){
        return "PolyCar accelerating";
    }
    public String brake(){
        return "PolyCar braking";
    }
}

class Honda extends PolyCar{
    public Honda(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda engine started";
    }

    @Override
    public String accelerate() {
        return "Honda accelerating";
    }

    @Override
    public String brake() {
        return "Honda braking";
    }
}
