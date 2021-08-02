
public class Complexity {
	
	//Implement method 0: time complexity O(n)
	public static void method0(int n) {int counter=0;
		for(int i=0;i<n; i++) {
			System.out.println("Operations " + counter); 
			counter++;
		}
	}
	
	//Implement method 1: time complexity o(n^2)
	public static void method1(int n) {
		int counter= 0;
		for(int i=0;i<n; i++) {
			for(int j=0;j<n; j++) {
				System.out.println("Operations " + counter); 
				counter++;
			}
		}
	}
	//Implement method 2: time complexity o(n^3)
	public static void method2(int n) {
		int counter= 0;
		for(int i=0;i<n; i++) {
			for(int j=0;j<n; j++) {
				for(int k=0;k<n;k++) {
					System.out.println("Operations " + counter); 
					counter ++;
				}
			}
		}
		
	}
	
	//Implement method 3: time complexity of O(logn)
	public static void method3(int n) {
		int counter= 0;
		for(int i=1;i<=n;i*=2) {
			System.out.println("Operation2 " + counter); 
			counter++;
			
		}
	}
	
	//IMplement method 4: time complexity of O(nlogn)
	
	public static void method4(int n) {
		int counter=0;
		for(int k=1; k<=n; k++) {
			for(int i=1;i<=n;i*=2) {
				System.out.println("Operation " + counter);
				counter ++;
			}
			
		}
		
	}
	//Implement method 5: time complexity of O(loglogn)
	public static void method5(int n) {
		int counter=0;
		//for(int i=1;i<=n;i*=2) {
			for (int i = 2; i <= n; i *= i)
				System.out.println("Operation " + counter);
				counter ++;
			}
		
	//}
		

	
	//Implement method 6 Optional question: O(2^n)
	static int count=0;
  public static int method6(int n) {
	  System.out.println("Operation " + count);
	  count++;
	   
	  if(n<=1) {
		  return 1;
	  }
	  return method6(n-1) + method6(n-2);
	  }
	  
  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method0(2);
		method1(2);
		method2(2);
		method3(2);
		method4(2);
		method5(2);
		method6(5);
		

	}

}
