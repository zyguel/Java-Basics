import java.util.Scanner;
public class nestedloops_11 {

	public nestedloops_11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		for (int c = 1; c <= rows; c++) {
		System.out.println("x is " + c);	
			for(int i=1; i<=rows; i++) {
				System.out.println();
				for(int j = 1; j<=columns; j++) {
					System.out.print(symbol);
				}
			}
		System.out.println();
		}
		scanner.close();
	}

}
