import java.lang.Math;

public class MyArray{
	public static void main(String[] args)
	{
	int arr[]=new int[20];
		for (int i=1;i<20;i++){
			arr[i]= (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
	}
}