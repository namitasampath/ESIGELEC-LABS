
public class IndividualHouse extends housing implements Rentable {
    private int numberOfLevels;

    public IndividualHouse(String address, int numberOfRooms, double[] areaOfRooms, int numberOfLevels) {
        super(address, numberOfRooms, areaOfRooms);
        this.numberOfLevels = numberOfLevels;
    }

    public double computeArea() {
        double total = 0;
        for (double area : areaOfRooms) total += area;
        return total / 2;
    }

    
    public double computeRentPrice() {
        return (computeArea() * 30) + (numberOfLevels * 100);
    }

    public String toString() {
        return "Individual House - " + super.toString() + ", Levels: " + numberOfLevels;
    }
}
