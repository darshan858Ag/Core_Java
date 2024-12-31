package Constructors;

public class Constructor1Main {
public static void main(String[] args) {
	
	Constructor1 c=new Constructor1();
	c.name="Darshan";
	c.id=01;
	c.display();
	
	Constructor1 c2=new Constructor1();
	c2.name="Kunal";
	c2.id=02;
	c2.display();
	
	Constructor1 c3=new Constructor1("Teena",03);
	c3.display();
	
    Constructor1 c4=new Constructor1("Sunil",04);
    c4.display();

}
}
