public class DriverB extends Driver{
    public DriverB(String name, boolean hasDriverLicence, int experienceInYear) {
        super(name, hasDriverLicence, experienceInYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водителеь категории B"+getName()+"начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водителеь категории B"+getName()+"закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водителеь категории B"+getName()+"заправляет авто");

    }
}
