package first;

import com.microsoft.playwright.*;           // Playwright types
import org.testng.annotations.*;             // <-- TestNG annotations (BeforeMethod, AfterMethod, Test)

public class AppTest {
  Playwright playwright;
  Browser browser;

  @BeforeMethod
  public void setup() {
    playwright = Playwright.create();
    browser = playwright.chromium()
        .launch(new BrowserType.LaunchOptions().setHeadless(false));
  }

  @Test
  public void openGoogle() {
    Page page = browser.newPage();
    page.navigate("https://app-gds-stkhldrrevampinsight-prod-un-001-btg9fhdsgtezhjed.uaenorth-01.azurewebsites.net");
  try {
    Thread.sleep(5000);   // just to pause and see browser
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();   // restore interrupt flag
    e.printStackTrace();
  }
   page.locator("//input[@type='email']").fill("manisha.sinha@artefact.com");
        page.locator("//input[@type='submit']").click();
        try {
    Thread.sleep(9000);   // just to pause and see browser
  } catch (InterruptedException e) {
    Thread.currentThread().interrupt();   // restore interrupt flag
    e.printStackTrace();
  }
   page.locator("//input[@id='idSIButton9']").click();
  System.out.println("Title: " + page.title());
  }

  @AfterMethod
  public void teardown() {
    if (browser != null) browser.close();
    if (playwright != null) playwright.close();
  }
  
}
