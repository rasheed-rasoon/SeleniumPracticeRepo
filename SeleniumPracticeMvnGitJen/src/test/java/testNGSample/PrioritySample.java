package testNGSample;

import org.testng.annotations.Test;

public class PrioritySample {
	@Test(priority=0)
	public void method1()
	{
		
	System.out.println("m1 priority 0");	
		
	}
	@Test(priority=4)
	public void method2()
	{
		
	System.out.println("m2 priority 4");	
		
	}
	@Test(priority=1,description=" as priority 1",enabled=false)
	public void method3()
	{
		
	System.out.println("m3 priority 1");	
		
	}
//	@Test(priority=3,invocationCount=3)
//	public void method4()
//	{
//	System.out.println("m4 priority 3");
//	}	
	
	@Test(priority=2,dependsOnMethods="method2")
	public void method5()
	{
	System.out.println("m5 priority 2");
	}	
}
