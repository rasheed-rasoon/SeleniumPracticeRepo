package testNGSample;

import org.testng.annotations.Test;

public class ExcludeAndIncludeEx {
	
	@Test(groups ={"Smoke"})
	public void method1()
	{
		
	System.out.println("Smoke");	
		
	}
	@Test(groups ={"Sanity"})
	public void method2()
	{
		
	System.out.println("Sanity");	
		
	}
	@Test(groups ={"Smoke"})
	public void method3()
	{
		
	System.out.println("Smoke");	
		
	}
	@Test(groups ={"Sanity"})
	public void method4()
	{
		
	System.out.println("Sanity");	
		
	}
	@Test(groups ={"Sanity"})
	public void method5()
	{
		
	System.out.println("Sanity ");	
		
	}
	@Test(groups ={"Regression"})
	public void method6()
	{
		
	System.out.println("Regression ");	
		
	}
}
