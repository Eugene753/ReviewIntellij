package reviewclass4;

public class NestedForLoop3 {

	public static void main(String[] args) {
		
		/*
		 * // when we will be entering the loop these two statements will executed int j=0; i<5
		 * after that all of the code inside the loop will be executed and then j=j-1 and the condition will be
		 * checked i<5; after that 
		 * j=j-1
		 * i<5;
		 * j=j-1
		 * i<5
		 * 
		 */
		
		for(int i=0;i<5;i=i+2) {
			for(int j=0;i<5;j=j-i) {
				System.out.println(i+" "+j);
				i++;
			}
		}

	}

}
