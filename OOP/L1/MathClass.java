
public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Math Functions used: Absolute, Maximum, Minimum, PI, cos, sin, power, random
		*/
		int i = -9, j=8;
		System.out.println("Value of i and j: "+ i+", "+j);
		System.out.println("Absolute value: "+ Math.abs(i)+", "+Math.abs(j));
		System.out.println("Maximum value of the two numbers: "+ Math.max(i,j));
		System.out.println("Minimum value of the two numbers: "+Math.min(i, j));
		
		double angle = 45.0 * 2.0 * Math.PI/360.0;
		System.out.println("cos("+ angle+") is "+ Math.cos(angle));
		System.out.println("sin("+ angle+") is "+ Math.sin(angle));
		
		System.out.println("Square of 6 is "+ Math.pow(6,2));
		System.out.println("Cube of 9 is "+ Math.pow(9, 3));
		
		System.out.println("Random number generated: "+ Math.random());
		System.out.println("Random number generated: "+ Math.random());
		

	}

}
