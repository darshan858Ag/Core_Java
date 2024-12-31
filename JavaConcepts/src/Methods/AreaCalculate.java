package Methods;

public class AreaCalculate {
void circle()
{
double r=10.5, pi=3.14, area;
area=pi*r*r;
System.out.println("Area of a circle is:"+area);
}

void square()
{
	int side=10, area;
	area=side*side;
	System.out.println("Area of a square is:"+area);
}

void rectangle()
{
	double l=10.5,b=5.5,area;
	area=l*b;
	System.out.println("Area of a rectangle is:"+area);
}

void triangle()
{
	double h=10.5,b=5.5,area;
	area=0.5*b*h;
	System.out.println("Area of a triangle is:"+area);
}
}
