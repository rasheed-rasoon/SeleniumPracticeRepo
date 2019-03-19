package NewJava8Libraries;





interface Addable
{
public int  add(int a,int b);	

}
public class LambdaExpressionWithParameter {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addable d2=(int a ,int b)->(a+b);
{
	
System.out.println("addition of a and b is "+d2.add(100,200));

};
	}

}
