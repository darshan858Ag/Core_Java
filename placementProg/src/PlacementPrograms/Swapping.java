package PlacementPrograms;

public class Swapping {
	
		// logical program 
		// input : a = 12 		b=15
		// output : a=15		b=12
		
		int a,b;					// declare instance variable
		
		public void setValue() {
			a=12;					// assigning  values to instance .. defining
			b=15;
		}
		
		public void swap() {
			int t = a;				// local variable 12
			a = b;					// a=15
			b = t;					// b = 12
		}
		
		public void getValues() {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		
		public static void main(String[] args) {
			Swapping sn = new Swapping();
			sn.setValue();
			System.out.println("Values before swap");
			sn.getValues();
			sn.swap();
			System.out.println("Values after swapping");
			sn.getValues();
		}
	}

