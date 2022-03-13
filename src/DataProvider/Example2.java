package DataProvider;

import org.testng.annotations.DataProvider;

public class Example2 {
	@DataProvider(name="Logincredentials")
	public static String[][]datareq()
	{
		String[][]data= {{"admin","manager"},{"manager","admin"},{"manager","admin"}};
		return data;
	}

}
