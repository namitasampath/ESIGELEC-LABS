public class groupHouse extends housing {
    private int numberOfLevels;

    public groupHouse(String address, int numberOfRooms, double[] areaOfRooms, int numberOfLevels) {
        super(address, numberOfRooms, areaOfRooms);
        this.numberOfLevels = numberOfLevels;
    }

    
    public double computeArea() {
        double total = 0;
        for (double area : areaOfRooms) total += area;
        return total / 2;
    }
    public double computeElectricityBill() {
    	return 0.25 * computeArea();
    }

    
    public String toString() {
        return "Group House - " + super.toString() + ", Levels: " + numberOfLevels;
    }
}
