package Groups;

import org.testng.annotations.Test;

public class Example1 {
	@Test(groups= {"smoke","reggression"})

	public void test()
	{
		System.out.println("I am Scenario");
	}
	@Test(groups= {"smoke","reggression"})
	public void test1()
	{
		System.out.println("I am Scenario2");
	}
	@Test(groups= {"system","reggression"})
	public void test2()
	{
		System.out.println("I am Scenario3");
	}
	@Test(groups= {"system","reggression"})
	public void test3()
	{
		System.out.println("I am Scenario4");
	}
	@Test(groups= {"reggression"})
	public void test4()
	{
		System.out.println("I am scenario5");
		
		System.out.println("I am scenario6");
		
		System.out.println("haii");
		
		
	}
}
