
public class MyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat =5;
		int [][]arr = new int[mat][mat];
		//starting the assignment of the numbers from the middle
		int x = mat/2, y=mat/2;
		int num= 1;
		arr[x][y]=num;
		//using the variable step to tell how far to travel in current direction before switching direction
		int step = 1;
		while(num< mat*mat ) {
			for(int i = 0;i<step && num< mat* mat;i++ ) {
				y++;
				num++;
				arr[x][y]=num;
				//assigning the new variable in matrix
			}
			for(int i = 0;i<step && num< mat* mat;i++ ) {
				x++;
				num++;
				arr[x][y]=num;
			}step++;
			for(int i = 0;i<step && num< mat* mat;i++ ) {
				y--;
				num++;
				arr[x][y]=num;
			}
			for(int i = 0;i<step && num< mat* mat;i++ ) {
				x--;
				num++;
				arr[x][y]=num;
			}step++;
		}
			//displaying final solution
		for(int i=0;i<mat;i++) {
				for(int j=0;j<mat;j++) {
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
	}
}
