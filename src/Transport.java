import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private boolean diagnosticPassed;
    private Type type;
    private List<Mechanic> mechanicList = new ArrayList<>();
    private List<Driver> driverList = new ArrayList<>();


    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        this.mechanicList = mechanics;
        setEngineVolume(engineVolume);
        setDriver(driver);

    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public String name() {
        return getType().name();
    }

    public void setDiagnosticPassed(boolean diagnosticPassed) {
        this.diagnosticPassed = diagnosticPassed;
    }

    public abstract String repair();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isDiagnosticPassed() {
        return diagnosticPassed;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) ;
        {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract Type getType();


    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "Модель: " + model + ", " +
                "Объем двигателя: " + engineVolume;
    }

    abstract boolean passDiagnostic() throws TransportTypeException;

    @Override
    public void pitStop() {

    }


    @Override
    public void circleTime() {

    }

    @Override
    public void maxSpeed() {
    }


    public abstract boolean getMechanics();

    public boolean checkTransportNeedService() {
        try {
            passDiagnostic();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }


    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driverList, mechanicList);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o)return true;
        if (o==null||getClass()!=o.getClass())return false;
        Transport transport=(Transport)o;
        return Objects.equals(brand,transport.brand)&&Objects.equals(model,transport.model)&&Objects.equals(engineVolume,transport.engineVolume)&&Objects.equals(driverList,transport.driverList)&&Objects.equals(mechanicList,transport.mechanicList);
    }
}

