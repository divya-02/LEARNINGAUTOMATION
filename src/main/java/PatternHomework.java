
public class PatternHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1();
		Pattern2();
		Pattern3();
		Pattern4();
		Pattern5();
		Pattern6();
		Pattern7();
		Pattern8();

	}
	
	public static void Pattern1() {
		for(int i = 1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
	public static void Pattern2() {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
	public static void Pattern3() {
		for(int i = 1 ;i<=5 ;i++) {
			for(int j = 5 ;j>=i;j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
	public static void Pattern4() {
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for(int i = 1 ;i<=4 ;i++) {
			for(int j = 4 ;j>=i;j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
	public static void Pattern5() {
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
		System.out.println("\n");
	}
	
	public static void Pattern6() {
		for (int i = 0; i < 5; i++) {
           
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
		System.out.println("\n");
	}
	
	public static void Pattern7() {
		
		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
		for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }
	}
	
	
	public static void Pattern8() {
		for (int i=0; i<5; i++){    
			for (int j=5-i; j>1; j--)   {   
			System.out.print(" ");   
			}    
			for (int j=0; j<=i; j++ )   {       
			System.out.print("* ");   
			}   
		System.out.println();   
		
		}
	}
}
