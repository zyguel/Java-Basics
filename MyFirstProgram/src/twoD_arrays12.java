
public class twoD_arrays12 {

	public twoD_arrays12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2D ARRAYS = am array of arrays
		
		String[][] cars = new String[3][3];
	int ndx, ndx2;
		for(ndx = 0; ndx < 3; ndx++) {
			for(ndx2 = 0; ndx2 < 3; ndx2++) {
				cars[ndx][ndx2] = "toyota[" + ndx + "][" + ndx2 + "]";
				
			}
		}
		for(ndx = 0; ndx < cars.length; ndx++) {
			System.out.println();
			for(ndx2 = 0; ndx2 < cars[ndx].length; ndx2++) {
				System.out.print(cars[ndx][ndx2]);
			}
		}
	}

}
