package practice_maven;

import org.testng.annotations.Test;

public class TestData 
{
	@Test
	public void readdata()
	{
	
	String BROWSER=System.getProperty("browser");
	String URL=System.getProperty("url");
	System.out.println(BROWSER);
	System.out.println(URL);
	}

}
