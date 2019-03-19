package rough;

public class CallByValueCallByRef {
	
	int data=50;
	void change(CallByValueCallByRef obj)
	{
		obj.data=obj.data+50;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueCallByRef obj=new CallByValueCallByRef();
		
		System.out.println("before change"+obj.data);
		obj.change(obj);
		System.out.println("After change"+obj.data);
	}

}
