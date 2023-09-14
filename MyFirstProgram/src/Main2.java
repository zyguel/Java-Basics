public class Main2 {

	public Main2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123;
		float  xy = 3.14f; // always end with f
		boolean z = true;
		char symbol = '@';
		System.out.println("My number is : " + x +"\t"+ xy + symbol);
		//int 2 billion
		long y = 9999999;
		System.out.println(y);
		String name = "Zyguel I.T. Solutions";
		System.out.println(name);
		
		String a = "Water";
		String b = "Juice";
		String temp = a;
		a = b;
		b = temp;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
