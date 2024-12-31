package E_CommerceWebsite;

public class Customer {

	String productName;
	float productPrice;
	int productQuantity;
	
	void setDataOfProduct()
	{
		productName="IPhone";
		productPrice=125000.0f;
		productQuantity=2;
		
	}
	void calculateBill()
	{
		float totalBill=productPrice*productQuantity;
		System.out.println("Product Name is :"+productName);
		System.out.println("Total amount of the purchased product is :"+totalBill);
		
	}
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setDataOfProduct();
		customer.calculateBill();
		
	}
}
