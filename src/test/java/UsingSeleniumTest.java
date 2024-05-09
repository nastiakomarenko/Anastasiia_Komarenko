import io.qameta.allure.Description;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSeleniumTest {
    private LoginPage loginPage;
    private HomePage homePage;
    private WorkShiftsPage workShiftsPage;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        workShiftsPage = new WorkShiftsPage(driver);
    }
    @Description("Test adding and deleting a shift")
    @Test
    public void testAddAndDeleteShift() {

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(16000));
        homePage = loginPage.login("Admin", "admin123");
        workShiftsPage = homePage.navigateToWorkShiftsPage();

        workShiftsPage.addNewShift("test", "06:00 AM", "06:00 PM", "Odis Adalwin");
        assertTrue(workShiftsPage.isShiftAdded("test"));

        workShiftsPage.deleteShift();
        String recordsListAfterTesting =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/span")).getText();

        assertEquals("No Records Found",recordsListAfterTesting);

    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}