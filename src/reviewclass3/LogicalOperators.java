package reviewclass3;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * 
		 * logical operators are used to combine multiple conditions in the same if block
		 * 
		 */
		//Without Logical Operators
		String day="Sunday";
		
		if("Sunday".equals(day)) {
			System.out.println("Relax its weekend don't otherwise its over");
		}else if(day.equals("Saturday")) {
			System.out.println("Relax its weekend don't otherwise its over");
		}else {
			System.out.println("I have to go to work");
		}
		
		//Using Logical operators
		if("Sunday".equals(day)||day.equals("Saturday")){
			System.out.println("Relax its weekend don't otherwise its over");
		}else {
			System.out.println("I have to goto work");
		}

	}

}
