import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicScenarioTest {

	@Test
	public void testWikipediaSearch() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://en.wikipedia.org");
		driver.findElement(By.id("searchInput")).sendKeys("The Matrix");
		driver.findElement(By.id("searchButton")).click();
		
		String title = driver.getTitle();
		assertThat(title, containsString("The Matrix"));
		
		driver.quit();
	}
}
