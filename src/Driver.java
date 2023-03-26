public abstract class Driver {
    private String name;
    private boolean hasDriverLicence;
    private int experienceInYear;

    public Driver(String name, boolean hasDriverLicence, int experienceInYear) {
        this.name = name;
        this.hasDriverLicence = hasDriverLicence;
        this.experienceInYear = experienceInYear;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refill();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public int getExperienceInYear() {
        return experienceInYear;
    }

    public void setExperienceInYear(int experienceInYear) {
        this.experienceInYear = experienceInYear;
    }
}

