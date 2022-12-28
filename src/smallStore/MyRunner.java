package smallStore;

import java.util.Scanner;

public class MyRunner {

	public static void main(String[] args) {

		Product p1= new Product();
		p1.id = 865;
		p1.name =" Milk ";
		p1.quantity =100;
		p1.price = 3;

		Product p2= new Product();
		p2.id = 815;
		p2.name =" Bread ";
		p2.quantity =50;
		p2.price = 2;

		Product p3= new Product();
		p3.id = 135;
		p3.name =" Chocolate ";
		p3.quantity =100;
		p3.price = 5;

		Product p4= new Product();
		p4.id = 222;
		p4.name =" Meat ";
		p4.quantity =40;
		p4.price = 10;
		
		Product[] products = {p1, p2, p3, p4};
		System.out.println("What do you want to do:\n1. Buy\n2. Search: ");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		switch(choice) {
		case 1:
			String invoice="";
			int totalPrice =0;
			while(true) {
				int i=1;
				System.out.println("Choice the product you want:");
				for(Product b :products) {
					System.out.println(i+ "- "+ b.name+"($"+b.price+")");
					i++;
				}
				System.out.println("-1 Finsh!");
				int select = s.nextInt();
				if(select ==-1) {
					break; 
				}
				Product temp = products[select-1];
				System.out.println("Enter quantity: ");
				int q = s.nextInt();
				invoice+= ("Name: "+temp.name+ ", Unit Price: "+temp.price +", Quntity: "+q+", Total; "+temp.quantity);
				totalPrice+=q*temp.price;
				
			}
			System.out.println(invoice);
			System.out.println("You have to pay: $"+totalPrice);
			break;
			
		case 2:
			s.nextLine();
			System.out.println("Enter product name: " );
			String pName = s.nextLine();
			for(Product a: products) {
				if(a.name.equalsIgnoreCase(pName)) {
					System.out.println("Product name: "+ a.name + "\nPrice: "+a.price +"\nlocation: "+a.location+"\nshelves: "+a.shelves);
				}
			}
			break;
			
		default:
			
			System.out.println("Invalid choice!");
			
			
		}
		
		
	}

}
