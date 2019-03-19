package NewJava8Libraries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product
	{
		int id;
		String name;
		float price;
		
		
		public Product(int id,String name,float price)
		{
			
		super();
		this.id=id;
		this.name=name;
		this.price=price;
			
		}
	}	
		
		public class LabmdaExpressionsComparator {
			
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"samsung ",65000f));
		list.add(new Product(2,"oneplus ",40000));
		
		list.add(new Product(3,"china ",10000f));
		
		list.add(new Product(4,"iphone ",75000f));
		
		list.add(new Product(5,"nokia ",20000f));
		
		list.add(new Product(6,"oppo ",25000f));
		
		Collections.sort(list,(a1,a2)->
		{
			return a1.name.compareTo(a2.name);			
		});
		
		for(Product p:list)
		{
			System.out.println(p.id+" "+" "+p.name+" "+p.price);
			
		}
		
		System.out.println("Phones names in which the  price greater than 20000 are");
		
		Stream<Product> storeData=list.stream().filter(p->p.price>20000);
		
		for (Product product : list) {
			System.out.println(product.name);
		}
	}
		
	}
		

		
	
