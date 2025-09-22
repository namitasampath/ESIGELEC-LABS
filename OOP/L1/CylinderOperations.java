public class CylinderOperations{
	public static void main(String[] args)
	{
	double D= 10.0, H=14.0, Pi= 3.14;
	double R = D/2;
	double V = Pi* R*R*H;
	double BSA = Pi*R*R;
	double P= 2*Pi*R;
	double LSA= 2*Pi*R*H;
	
	System.out.println("The radius of base"+ R);
	System.out.println("The volume is "+ V );
	System.out.println("The Surface of its base is "+ BSA );
	System.out.println("The perimeter of its base is "+ P );
	System.out.println("The lateral surface area is "+ LSA );
	}
}