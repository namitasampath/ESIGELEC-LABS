
public abstract class housing {
	private String address;
	private int numberOfRooms;
	public double []areaOfRooms;
	
	public housing (String address, int numberOfRooms, double[]areaOfRooms) {
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.areaOfRooms = areaOfRooms;
	}
	
	public String getAddress() {
		return address;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public double[] getAreaOfRooms() {
		return areaOfRooms;
	}
	
	public abstract double computeArea();
	
	public String toString() {
		return "Address: "+ address+", Rooms: "+ numberOfRooms;
	}
		
}
