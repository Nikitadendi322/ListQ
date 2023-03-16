import java.util.List;

public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver, List<Mechanic>mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.setDiagnosticPassed(true);
    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Грузовика");

    }


    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    public void printType(boolean getLoadCapacity, LoadCapacity loadCapacity) {
        if (getLoadCapacity(loadCapacity) == null) {
            System.out.println("Не достаточно данных");
        } else {
            System.out.println(getLoadCapacity);
        }
    }


    @Override
    public void circleTime() {
        int minFound = 60;
        int maxFound = 120;
        int theBestTimeInMins = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для Грузовика" + theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 45;
        int maxFound = 98;
        int maxSpeed = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость Грузовика" + maxSpeed);
    }
    @Override
    public String repair(){return "Трактор на ремонте";}
    public LoadCapacity getLoadCapacity(LoadCapacity loadCapacity) {
        return loadCapacity;
    }

    @Override
    public boolean passDiagnostic(){
        return this.isDiagnosticPassed();
    }
}
