import java.util.List;

public class Bus extends Transport<DriverD> {
    private BodyType bodyType;



    public Bus(String brand, String model, double engineVolume, DriverD driver, BodyType bodyType, List<Mechanic>mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.pitStop();
        this.circleTime();
        this.maxSpeed();
        this.getType();
        this.setBodyType(bodyType);
        this.setDiagnosticPassed(false);

    }


    @Override
    public void setDiagnosticPassed(boolean diagnosticPassed) {
        super.setDiagnosticPassed(diagnosticPassed);
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автобуса");

    }

    @Override
    public void circleTime() {
        int minFound = 90;
        int maxFound = 150;
        int theBestTimeInMins = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автобуса"+theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 60;
        int maxFound = 130;
        int maxSpeed = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автобуса"+maxSpeed);

    }


    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусам проходить диагностику не нужно");
    }

    @Override
    public boolean isDiagnosticPassed() {
        return false;
    }

    public BodyType getBodyType() {
        return bodyType;
    }


    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String repair(){return "Ремонтируем а втобуса салон";}


}
