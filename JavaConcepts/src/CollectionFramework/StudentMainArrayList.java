package CollectionFramework;

public class StudentMainArrayList {
	public static void main(String[] args) {
		
    //Array List
	Student s1=new Student("Mona",101);
	Student s2=new Student("Kunal",202);
	Student s3=new Student("rital",303);
	
	Student s[]=new Student[5];
	
	s[0]=s1;
	s[1]=s2;
	s[2]=s3;
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
}
}
