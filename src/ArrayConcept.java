import java.util.Scanner;


public class ArrayConcept {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String a[][]= new String[2][3];
		System.out.println(a.length);  // total no of rows
		System.out.println(a[0].length);   //total no of columns
		
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[0].length;col++){
				a[row][col] = s.nextLine();
				
			}
		}
		
}
}