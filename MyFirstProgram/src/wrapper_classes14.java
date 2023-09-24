
public class wrapper_classes14 {

	public wrapper_classes14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// wrapper class = provides a way to use primitive data types as reference data types
	//		reference data types contain useful methods
	//		can be used with collections (ex. ArrayList);
	
		
	/*
	 * Primitive		wrapper 
	 * 
	 * boolean			Boolean
	 * char 			Character
	 * int 				Integer
	 * double			Double
	 */
		
		//autoboxing = the automatic conversion that the Java compiler makes between the primitive datatype and their correpsonding wrapper class
		
		//unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Zyguel"; // already a reference data types
		
		if(b == '@') {
			System.out.println("This is true!");
		}
		
		
		System.out.println("Hello World");
	}

}
