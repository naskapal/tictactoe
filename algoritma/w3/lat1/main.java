package lat1;

public class main {

	public static void main (String[] args){
		int a [][], b [][];
		a = new int [2][3];
		b = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		b[0][0] = 5;
		int c[][] = new int [2][3];
		c[0][0] = a[0][0] + b[0][0] + a[0][3];
		System.out.println(c[0][0]);
	}
}
