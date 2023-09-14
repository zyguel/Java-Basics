
public class array11 {

	public array11() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		// Array = used to store multiple
		// values in a single row;
		String[] cars = {"Camaro" , "Hilux", "Tesla"};
		
		cars[0] = "Mustang";
  		System.out.println(cars[0]);
  		String[] cars2 = new String[3];
  		
  		cars2[0] = "Hitachi toyota";
  		cars2[1] = "BMW0";
  		cars2[2] = "Itachi";
  		int ndx;
  	
  		// for loops are similar to C so there should be no should be no issue	
  		for (ndx = 0;ndx < cars.length; ndx++) {
  			System.out.println(cars2[ndx]);
  		}
		
	}
}
