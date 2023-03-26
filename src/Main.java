import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) throws TransportTypeException {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver №" + i, true, 5 + i);
            Car car = new Car(
                    "Car brand №" + i,
                    "Car model №" + i,
                    1.4,
                    driverB,
                    BodyType.CROSSOVER,
            );
            DriverC driverC = new DriverC("Driver №" + i, true, 7 + i);
            Truck truck = new Truck(
                    "Truck brand №" + i,
                    "Truck model №" + i,
                    4.0,
                    driverC,
            );
            DriverD driverD = new DriverD("Driver №" + i, true, 10 + i);
            Bus bus = new Bus(
                    "Bus brand №" + i,
                    "Bus model №" + i,
                    4.8,
                    driverD,
                    BodyType.COUPE,

            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);

            System.out.println(truck.passDiagnostic());
            System.out.println(car.passDiagnostic());
            System.out.println();

            truck.passDiagnostic();
            car.passDiagnostic();
            bus.passDiagnostic();
            TestCar.checkTransport(bus,truck,truck);

            Mechanic mechanicIvan=new Mechanic("Ivan","Ivanon","Z-Auto");
            Mechanic mechanicPetr=new Mechanic("Petr","Pavlov","Z-Auto");
            Mechanic mechanicViktor=new Mechanic("Viktor","Pavlov","Z-Auto");

            Car car=new Car("Opel","Corsa",12,"B",BodyType.HATCHBACK,List.of(mechanicIvan));
            Bus bus=new Car("Mersedes","Conecto",12,"C",BodyType.CROSSOVER,List.of(mechanicPetr));
            Truck truck=new Car("Белаз","75231",12,"D",BodyType.COUPE,List.of(mechanicViktor));
            System.out.println(bus.getDriver());
            System.out.println(bus.getMechanics());

            DriverB<Car>driverB=new DriverB("Ivan",true,20);
            DriverC<Truck>driverC=new DriverC("Petr",true,1);
            DriverD<Bus>driverD=new DriverD("Viktor",true,4);

            List<Transport> racers=new ArrayList<>();

            racers.add(car);
            racers.add(truck);
            racers.add(bus);

            mechanicIvan.fixTheCar(bus);
            mechanicIvan.performMaintenance(bus);


            List<Driver>drivers=new ArrayList<>();
            drivers.add(driverB);
            drivers.add(driverC);
            drivers.add(driverD);

            List<Mechanic>mechanics=new ArrayList<>();


            Mechanic<Car>mechanic1=new Mechanic("Алексей","Павлов","Zed-Company");
            Mechanic<Truck>mechanic2=new Mechanic("Иван","Иванов","Red-Company");
            Mechanic<Bus>mechanic3=new Mechanic("Cергей","Cергеевич","Blue-Company");

            car.addDriver(DriverB);
            car.addDriver(DriverC);
            car.addMechanic(mechanic1);
            bus.addDriver(DriverD);
            bus.addMechanic(mechanic3);
            truck.addDriver(DriverC);
            truck.addMechanic(mechanic2);








        }

    }






    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель"+transport.getDriver().getName()+"управляет автомобилем"+transport.getBrand()+" и будет учавстовать в заездах");
    }


}