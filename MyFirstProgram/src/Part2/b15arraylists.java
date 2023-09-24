package Part2;

import java.util.ArrayList;

public class b15arraylists {

	public b15arraylists() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Lists  = a resizable array
		//Elemenets can be added and removed after compilation phase
		// store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Lasagna");
		
		food.set(0, "sushi");
		food.remove(2);
		//food.clear();
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
