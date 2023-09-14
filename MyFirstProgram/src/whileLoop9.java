import java.util.Scanner;

public class whileLoop9 {
	public static void main(String[] args) {
// while loop = executes a block of code as long as it's a condition remains true
	Scanner scanner = new Scanner(System.in);
	String name = "";
	//While
/*	while(name.isBlank()) {
		System.out.println("Enter your name : ");
		name = scanner.nextLine();
	}*/
	//Do -while
	do {
		System.out.println("Enter your name : ");
		name = scanner.nextLine();
	}while(name.isBlank());
	
	System.out.println("Hello " + name);
	scanner.close();
	}
	
}
