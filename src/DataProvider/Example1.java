package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example1 {
	@Test(dataProvider="Logincredentials")
	public static void test(String un,String pwd)
	{
		System.out.println(un+""+pwd);
	}
	@DataProvider(name="Logincredentials")
	public static String[][] datareq()
	{
		String[][] data= {{"admin","manager"},{"manager","admin"},{"manager","adm"}};
		return data;
	}
}
