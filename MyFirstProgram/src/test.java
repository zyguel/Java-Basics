
public class test {
	
	private static String NULL;
	private String name;
	private int var1;
	
	  
	public test() {
		// TODO Auto-generated constructor stub
	this.name = NULL;
	this.var1 = 0;
		
	}
	public test(String n, int num) {
		this.name = n;
		this.var1 = num;
	}
	
	public String toString() {
		return "My name is " + name + " and this is test number : " + var1;
	}
	
	
	public static void main(String[] args) {
		test t = new test("Zyguel",1);
	
		System.out.println(t.toString());
		
	}
} 
