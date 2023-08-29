public class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    private int bigCars;
    private int mediumCars;
    private int smallCars;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big > 0 && big > bigCars) {
                    bigCars++;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (medium > 0 && medium > mediumCars) {
                    mediumCars++;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (small > 0 && small > smallCars) {
                    smallCars++;
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }
}
