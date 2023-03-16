public enum Size {
    X1(0,10),
    X2(10,25),
    X3(25,50),
    X4(50,80),
    X5(80,120);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    Size() {
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    public static Size getValue(int value){
        for (Size e: Size.values()){
            if (value >=e.getMin()&& value<=e.getMax()){
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Size{" +
                "min=" + min +
                ", max=" + max +
                "} "+super.toString();
    }

}
