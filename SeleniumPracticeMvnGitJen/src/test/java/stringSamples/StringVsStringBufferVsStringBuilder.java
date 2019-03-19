package stringSamples;

public class StringVsStringBufferVsStringBuilder {

	
	public static void StringSample()
	{
		
		
		String str="Rasheed";
		System.out.println("before concatenation is "+str);
		str.concat("ahmed");
		

		System.out.println("after concatenation is "+str);
	}
	public static void StringBufferSample()
	{
		
		
		StringBuffer str=new StringBuffer("Rasheed");
		System.out.println("before concatenation using StringBuffer is "+str);
		str.append("ahmed");
		

		System.out.println("after concatenation StringBuffer is  "+str);
	}
	
	public static void StringBuilderSample()
	{
		
		
		StringBuilder str=new StringBuilder("Rasheed");
		System.out.println("before concatenation using StringBuilder is "+str);
		str.append("ahmed");
		

		System.out.println("after concatenation StringBuilder is  "+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringSample();
		//StringBufferSample();
		StringBuilderSample();
	}

}
