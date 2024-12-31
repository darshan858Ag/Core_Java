package Methods;

public class Average {

	int sum1;
	public void avg() {
	Addition add=new Addition();
	sum1=add.sum(1, 20, 60);
		int r=sum1/3;
		System.out.println("Average is:"+r);
	}
	public static void main(String[] args) {
		Average a=new Average();
		a.avg();
	}
}
