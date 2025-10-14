
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	        double[] aptRooms = {20.5, 15.0, 12.0};
	        double[] indRooms = {25.0, 30.0, 20.0, 18.0};
	        double[] grpRooms = {22.0, 28.0, 19.0, 16.0};

	        apartment apt = new apartment("12 Sotteville-de-Rue", 3, aptRooms, 2);
	        IndividualHouse indHouse = new IndividualHouse("45 St. Etienne du Ruvray", 4, indRooms, 2);
	        groupHouse grpHouse = new groupHouse("8 Avenue Champlain", 4, grpRooms, 3);

	        System.out.println(apt);
	        System.out.println(indHouse);
	        System.out.println(grpHouse);

	        System.out.println("\nAreas");
	        System.out.println("Apartment area: " + apt.computeArea());

	        System.out.println("Individual house area: " + indHouse.computeArea());
	        System.out.println("Group house area: " + grpHouse.computeArea());

	        System.out.println("\nRent Prices");
	        System.out.println("Apartment rent: " + apt.computeRentPrice() + " €");
	        System.out.println("Individual house rent: " + indHouse.computeRentPrice() + " €");
	        
	        System.out.println("\nElectricity Bill");
	        System.out.println("Electricity Bill for apartment: " + apt.computeElectricityBill()+ " €");

	    
	}

}
