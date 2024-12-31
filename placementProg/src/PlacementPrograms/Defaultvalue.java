package PlacementPrograms;

public class Defaultvalue {
	
	int no;
	float no1;
	double no2;
	long no3;
	char ch;
	boolean b;
	public  void getData()
	{
		System.out.println("Int no="+no);
		System.out.println("float no="+no1);
		System.out.println("double no="+no2);
		System.out.println("long no="+no3);
		System.out.println("char no="+ch);
		System.out.println("boolean no="+b);
		}
	public static void main(String[] args) {
	Defaultvalue D=new Defaultvalue();
	D.getData();
}
}
