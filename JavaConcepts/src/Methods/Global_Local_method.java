package Methods;


	// global variable is one ie:no
	// local variables are two:no1 and no2
	//user defined methods---two  setData() and getData()
	//main() method
	public class Global_Local_method {
	// global variable
		int no;

//		non static method
//		method is a group of executable statements
//		reusability
//		method definition
		void setData() {
//			 local variable
			int no2 = 89;
			no = 100;
			System.out.println("No2=" + no2);

		}

//		 method definition
		void getData() {
			System.out.println(no);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			local variable
			int no1;
			no1 = 20;
			System.out.println("No1=" + no1);
//			initialization of an object
			Global_Local_method g = new Global_Local_method();
//			call to the method setData()
			g.setData();
//			call to the getData()
			g.getData();

		}

	}

