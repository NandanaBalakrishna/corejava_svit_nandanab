package org.tnsif.sf.c2tc.keywords;

class Product1
{
	double price;
	
	Product1(double price)
	{
		this.price=price;
	}

double calculateDiscount()
{
	return this.price*0.10; //apply 10% discount
}
double calculateFinalPrice()
 {
	 return this.price-this.calculateDiscount();
 }
}
public class ThisKeyword_demo {
	

		public static void main(String[] args) {
			Product1 pd=new Product1(400);
	        System.out.println("Final price "+pd.calculateFinalPrice());
		}

	



}


