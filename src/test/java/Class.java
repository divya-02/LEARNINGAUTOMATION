import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Class {
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
