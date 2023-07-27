import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	  @Test
	  public void f() {
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BEfore method");
		 
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After method");
	  }
}