
public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		
		for (int a = 0; a < x.length; a++){
			for (int j = 1; j <= 10; j++){
				int result = x[a] * j;
				System.out.println("Result: " + result);
			}
		}
	}

}
