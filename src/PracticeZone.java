import java.util.Scanner; // For input/output operations
import java.util.Arrays;

public class PracticeZone{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double total = 0;
		double max = 0;
		Product[] product = {
							new Product("RTX2000", 1000),
							new Product("iPhone",500),
							new Product("Android",200),
							new Product("MateBook",700),
							};
							
		System.out.println();
		// Print all products with price greater than 500
		for(int i = 0; i < product.length; i++){
			double priceIncrease = 0.1;
			if(product[i].price >= 500){
				System.out.println(product[i].name + " " + product[i].price);
			}
			
			// Increase all product prices by 10%
			product[i].price += product[i].price * priceIncrease;

			// Calculate the total price of all products
			total += product[i].price;
			
			// Find the product with the highest price
			if(product[i].price  > max){
				max = product[i].price;
			}
		}

		System.out.println("Prices after 10% increase: ");
		for(int i = 0 ; i < product.length; i++){
			System.out.println(product[i].name + ": " + product[i].price);
		}
		
		
		// Sort products by price (ascending)
		System.out.println("\n" + total);
		System.out.println(max + " \n");
		
		sc.close();
	}
}

class Product{
	String name;
	double price;

	Product(String nameOfProduct, double priceOfProduct){
		this.name = nameOfProduct;
		this.price = priceOfProduct;
	}

}