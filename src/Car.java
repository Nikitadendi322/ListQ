import java.util.List;

public class Car extends Transport<DriverB> implements Competing {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, List<Mechanic>mechanics) {
        super(brand, model, engineVolume, driver,mechanics);
        this.setBodyType(bodyType);
        this.setDiagnosticPassed(true);
    }
    public String repair(){
        return "Ремонтируем подвестку у автомобиля";
    }





    public void startMove() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }


    public void finishMove() {
        System.out.println("Автомобиль марки" + getBrand() + "закончил движение");

    }


    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автомобиля");

    }

    @Override
    public void circleTime() {
        int minFound = 150;
        int maxFound = 230;
        int theBestTimeInMin = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автомобиля" + theBestTimeInMin);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 90;
        int maxFound = 270;
        int maxSpeed = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автомобиля" + maxSpeed);
    }

    @Override
    public boolean checkTransportNeedService() {
        return super.checkTransportNeedService();
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }


    @Override
    public boolean passDiagnostic(){
        return this.isDiagnosticPassed();
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}