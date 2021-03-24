package reviewclass4;

public class Example {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if((i==2 && j==2) || (i==2 && j==3)||(i==3 && j==2) || (i==3 && j==3)) {
					System.out.print(" ");
				}else {
					System.out.print("$");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=7;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
