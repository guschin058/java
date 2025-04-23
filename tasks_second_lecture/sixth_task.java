class Vehicle {
    protected String brand; 
    protected int year;     
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("Транспортное средство: " + brand + ", год выпуска: " + year);
    }   
    public int getMaxSpeed() {
        return 0;
    }
}
class LandVehicle extends Vehicle {
    protected int wheelCount;  
    public LandVehicle(String brand, int year, int wheelCount) {
        super(brand, year);
        this.wheelCount = wheelCount;
    }
    @Override
    public void displayInfo() {
        System.out.println("Наземное ТС: " + brand + 
                         ", год: " + year + 
                         ", колес: " + wheelCount);
    }
    @Override
    public int getMaxSpeed() {
        return 120;
    }
}
class Car extends LandVehicle {
    private String bodyType;      
    public Car(String brand, int year, int wheelCount, String bodyType) {
        super(brand, year, wheelCount);
        this.bodyType = bodyType;
    }
    @Override
    public void displayInfo() {
        System.out.println("Автомобиль: " + brand + 
                         ", год: " + year + 
                         ", колес: " + wheelCount +
                         ", кузов: " + bodyType);
    }
    @Override
    public int getMaxSpeed() {
        return 220;
    }
}
class Truck extends LandVehicle {
    private double loadCapacity;      
    public Truck(String brand, int year, int wheelCount, double loadCapacity) {
        super(brand, year, wheelCount);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo() {
        System.out.println("Грузовик: " + brand + 
                         ", год: " + year + 
                         ", колес: " + wheelCount +
                         ", грузоподъемность: " + loadCapacity + "т");
    }
    @Override
    public int getMaxSpeed() {
        return 90;
    }
}

public class sixth_task {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new LandVehicle("Мотоцикл", 2020, 2),
            new Car("Toyota", 2022, 4, "Седан"),
            new Truck("Volvo", 2021, 6, 15.0)
        };
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("Макс. скорость: " + vehicle.getMaxSpeed() + " км/ч");
            System.out.println();
        }
    }
}