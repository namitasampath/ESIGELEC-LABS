
public class apartment extends housing implements Rentable, Electricity {
    private int floorNumber;

    public apartment(String address, int numberOfRooms, double[] areaOfRooms, int floorNumber) {
        super(address, numberOfRooms, areaOfRooms);
        this.floorNumber = floorNumber;
    }

    public double computeArea() {
        double total = 0;
        for (double area : areaOfRooms) total += area;
        return total;
    }

    
    public double computeRentPrice() {
        return (computeArea() * 20) - (floorNumber * 10);
    }
    
    public double computeElectricityBill() {
    	return 0.25 * computeArea();
    }

    
    public String toString() {
        return "Apartment - " + super.toString() + ", Floor: " + floorNumber+", Rent Price: ";
    }
}
