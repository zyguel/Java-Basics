package Part2;
import java.util.*;
public class b16_2DarrayList {

	public b16_2DarrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
			ArrayList<String> bakeryList = new ArrayList();
			bakeryList.add("pasta");
			bakeryList.add("garlic bread");
			bakeryList.add("donuts");
			
			ArrayList<String> produceList = new ArrayList();
			produceList.add("tomatoes");
			produceList.add("zucchini");
			produceList.add("peppers");
			
			ArrayList<String> drinksList = new ArrayList();
			produceList.add("soda");
			produceList.add("coffee");
			
			groceryList.add(bakeryList);
			groceryList.add(produceList);
			groceryList.add(drinksList);
			
		//	System.out.println(produceList.get(0));
			System.out.println(groceryList.get(2).get(1));
	}

}
