package practice_maven;

import org.testng.annotations.Test;

public class CreateTest 
{
	@Test(groups = "smoke")
	public void create()
	{
		System.out.println("test created-Smoke");
	}
	@Test(groups = "regression")
	public void update()
	{
		System.out.println("test updated-Regression");
	}
}
