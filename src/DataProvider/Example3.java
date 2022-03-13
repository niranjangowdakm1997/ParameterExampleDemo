package DataProvider;

import org.testng.annotations.Test;

public class Example3 {
	@Test(dataProvider="Logincredentials",dataProviderClass=Example2.class)
	public static void test(String un,String pwd)
	{
		System.out.println(un+""+pwd);
	}

}
