package Part2;
import java.util.ArrayList;
public class b17_for_each_loop {

	public b17_for_each_loop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for-each = traversing technique to iterate through the elements in an array/collection
		// less steps, more readable
		// less flexible;
		
			//String[] animals = {"cat", "dog", "rat" , "bird"};
			ArrayList<String> animals = new ArrayList();
			animals.add("cat");
			animals.add("dog");
			animals.add("rat");
			animals.add("bird");
			for (String i : animals) {
				System.out.println(i);
			}
	}

}
