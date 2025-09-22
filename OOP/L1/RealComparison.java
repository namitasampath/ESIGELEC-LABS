public class RealComparison{
	public static void main(String[] args)
	{
		int a=6,b=7,c=2;
		int min=a;
		if(b<min){
			min=b;
		}else if(c<min){
		min = c;
		}
		int max;
		if(b>a && b>c){
		max=b;
		}else if(a>b && a>c){
		max= a;
		}else{
		max = c;
		}
		System.out.println("Biggest number: "+ max);
		System.out.println("Smallest number: "+min);
		
	}
}