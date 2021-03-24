package reviewclass3;

public class LogicalOperators2 {

	public static void main(String[] args) {
		int number=10;
		/*
		 * 
		 * if the variable number contains a value between 0 to 100 
		 *
		 * otherwise print("out of range")
		 */
		
		
		if(number>=0) {
			if(number<=100) {
				System.out.println("0 to 100");
			}
		}else {
			System.out.println("Out of range");
		}
		
		if(number>=0 && number<=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of range");
		}
		

	}

}
