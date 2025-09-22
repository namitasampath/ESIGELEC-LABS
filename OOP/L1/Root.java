import java.lang.Math;

public class Root{
	public static void main(String[] args)
	{
		double a= 5.0, b=6.0, c=1.0;
		double D= (b*b) - (4*a*c);
		
		
		if(D>0){
		double x1 = (-b+(Math.pow(D, 0.5))/(2*a));
		double x2 = (-b-(Math.pow(D, 0.5))/(2*a));
		System.out.println("Roots are: "+ x1+ ", "+ x2);
		}
		else if(D==0){
		double root = (-b+Math.sqrt(D))/(2*a);
		System.out.println("Root is : "+ root);		
		}else {
			System.out.println("No root exists.");
		}
	}
}