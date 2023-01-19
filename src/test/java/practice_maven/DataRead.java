package practice_maven;

import org.testng.annotations.Test;

public class DataRead 
{
	@Test
	public void readData()
	{
	
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	System.out.println(BROWSER);
	System.out.println(URL);
	}
}
