
public class switch7 {

	public switch7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch  statement that alllows a variable to be tested for equality against a list of values
		//works with byte, short, char and int primitive datatypes. Also works with enums.
		
		String day = "Mday";
		switch(day) {
		case "Sunday": System.out.println("IT is Sunday!");
		break;
		case "Monday":System.out.println("IT is Monday!");
		break;
		case "Tuesday":System.out.println("IT is Tuesday!");
		break;
		case "Wednesday":System.out.println("IT is Wednesday!");
		break;
		case "Thursday":System.out.println("IT is Thursday!");
		break;
		case "Friday":System.out.println("IT is Friday!");
		break;
		default: System.out.println("Day does not exist");
		}
		
	}

}
