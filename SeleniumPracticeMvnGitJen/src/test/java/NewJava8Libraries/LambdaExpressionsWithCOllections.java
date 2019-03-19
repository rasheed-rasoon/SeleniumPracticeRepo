package NewJava8Libraries;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionsWithCOllections {
	
	
	public static void lambdaArrayList()
	{
		
		// TODO Auto-generated method stub
				List<String> list=new ArrayList<>();
				list.add("Rasheed");
				list.add("ahmed");
				list.add("sheik");
				
				list.add("Nagendra");
				System.out.println("using foreach loop");
				
				
				for(String str:list)
				{
					System.out.println(str);
				}
				
				System.out.println("Iterate using Lambda");
				list.forEach((n)->System.out.println(n)
						
	
						);
		
	}
	
	

	public static void main(String[] args) {
		lambdaArrayList();
	}

}
