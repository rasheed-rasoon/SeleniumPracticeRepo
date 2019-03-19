package NewJava8Libraries;


interface Addable2
{
public int add(int a ,int b);


}

public class LambdaExpressionWithOrWithOutreturn {

	
	public static void main(String []args)
{
		
		
		Addable2 add1=(int a ,int b)->(a+b);
		
			
			System.out.println("without return type lambda expression "+add1.add(300, 400));
			
	
			Addable2 add2=(int a,int b)->

{
	return (a+b);
};
System.out.println("with return type lambda expression "+add2.add(5, 9));	


}
	
	
	
}
