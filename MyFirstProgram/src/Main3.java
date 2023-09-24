import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.next();
		System.out.println("How old are you?");
		int age = scanner.nextInt(); // leaves \n which skips the next;
		//scanner.nextLine(); // quick fix 
		System.out.println("What is your favorite food? ");
		String food = scanner.next();
		int length = name.length();
		System.out.println("Hello "+name + 
				", You are "+age +" years old." +
				" You like "+ food + length);
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		sb.append(name);
		sb.append(", You are ");
		sb.append(age + " ");
		sb.append("years old.");
		sb.append(" You like ");
		sb.append(food + " ");
		sb.append(length);
		sb.append(".");
		System.out.println(sb);
		
		scanner.close();
	}

}
