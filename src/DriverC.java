public class DriverC extends Driver{

    public DriverC(String name, boolean hasDriverLicence, int experienceInYear) {
        super(name, hasDriverLicence, experienceInYear);
    }

    @Override
    public void startMove() {
        System.out.println("Водителеь категории C"+getName()+"начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водителеь категории C"+getName()+"закончил движение");

    }

    @Override
    public void refill() {
        System.out.println("Водителеь категории C"+getName()+"заправляет авто");

    }
}
