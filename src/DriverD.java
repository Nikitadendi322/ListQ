public class DriverD extends Driver{

    public DriverD(String name, boolean hasDriverLicence, int experienceInYear) {
        super(name, hasDriverLicence, experienceInYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водителеь категории D"+getName()+"начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водителеь категории D"+getName()+"закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водителеь категории D"+getName()+"заправляет авто");

    }
}
