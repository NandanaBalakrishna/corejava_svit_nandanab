package org.tnsif.sf.c2tc.keywords;

public class Product {
			double price;
			
			Product(double price)
			{
				this.price=price;
			}

		public Product(int price2) {
				// TODO Auto-generated constructor stub
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

		

	


