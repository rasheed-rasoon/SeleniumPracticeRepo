package rough;

public class WrapperClassExamples {
	
	public void wrapperToObject()
	{
		int i=2;
		Integer x=Integer.valueOf(i);
		
		
		float z=2;
		String itr=Float.toString(z);
		
	}
	
	public void objectType()
	{
		Integer i=new Integer(2);
		int z=i;
		
		
		//Integer k=new
		String str=new String("2");
		int k=Integer.parseInt(str);
		
		
		String str2=new String("2");
	float k2=Float.valueOf(str2);
		
	
	Integer in=new Integer(4);
	int k3=Integer.valueOf(in);
	
	Integer in2=new Integer(4);
	float k4=Float.valueOf(in2);
	
	
	int l=3;
	String str6=Integer.toString(l);

	
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
