
package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Pages.CategoriesPage;
import com.Pages.Common_XPaths;
import com.Pages.CoursingPage;
import com.Pages.DepartmentPage;
import com.Pages.Driver_Manager;
import com.Pages.KitchenPrinterPage;
import com.Pages.LoginPage;
import com.Pages.ProductItems_Menu_RetailPage;
import com.Pages.ReportsPage;
import com.Pages.ServingSizeLevelsPage;
import com.Pages.SubCategoriesPage;
import com.Pages.UpchargesPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reports_Employee_Labor {

	
	WebDriver driver=new Driver_Manager().getDriver();
	ExtentReports rep=new Driver_Manager().getRep(); 
	ExtentTest test=new Driver_Manager().test;
	
	LoginPage lgpg=new LoginPage(); 
	
	Utility ut=new Utility();
	 
	Common_XPaths cmp=new Common_XPaths(); 
	LoginTest a=new LoginTest();
	CategoriesPage ctp=new CategoriesPage();
	DepartmentPage dp=new DepartmentPage();
	CoursingPage cp=new CoursingPage();
	ServingSizeLevelsPage ssl=new ServingSizeLevelsPage();
	KitchenPrinterPage kp=new KitchenPrinterPage();
	ProductItems_Menu_RetailPage pmt=new ProductItems_Menu_RetailPage();
	UpchargesPage up=new UpchargesPage();
	SubCategoriesPage scp=new SubCategoriesPage();
	ReportsPage repts=new ReportsPage();
	
	
	@Given("Open the Reports - Employee Labor Report home page BaseURL and storeID")
	public void openTheReportsEmployeeLaborReportHomePageBaseURLAndStoreID() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		repts.openTheReportsEmployeeLaborHomePageBaseURLAndStoreID();
		try {
		cmp.Close_Online_Help_ChatBox();}
		catch(Exception K) {}
	}
	
	@Given("Verifying the Employee Labor Report Header Page")
	public void verifyingTheEmployeeLaborReportHeaderPage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    repts.verifyingTheReportEmployeeLaborHeaderPage();
	}
	
 
//@Then("Check Employee Field is Displayed")
//public void checkEmployeeFieldIsDisplayed() {
//repts.IcheckEmployeeFieldIsDisplayed();
//}

@Then("Check Process Field is Displayed")
public void checkProcessFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckProcessFieldIsDisplayed();
}

@Then("Check Format Field is Displayed")
public void checkFormatFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckFormatFieldIsDisplayed();
}

@Then("Check Active\\/Inactive Field is Displayed")
public void checkActiveInactiveFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckActiveInactiveFieldIsDisplayed();
}

@Then("Check Shift Status Field is Displayed")
public void checkShiftStatusFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckShiftStatusFieldIsDisplayed();
}

//@Then("Check Time Period Field is Displayed")
//public void checkTimePeriodFieldIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    repts.IcheckTimePeriodFieldIsDisplayed();
//}

@Then("Check Search Field is Displayed")
public void checkSearchFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckSearchFieldIsDisplayed();
}

@Then("Check Columns Field is Displayed")
public void checkColumnsFieldIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckColumnsFieldIsDisplayed();
}

//@Then("Check Export Field is Displayed")
//public void checkExportFieldIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    repts.IcheckExportFieldIsDisplayed();
//}

//@Then("Check Name Field in Table is Displayed")
//public void checkNameFieldInTableIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    repts.IcheckNameFieldInTableIsDisplayed();
//}

@Then("Check Employee Id Field in Table is Displayed")
public void checkEmployeeIdFieldInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckEmployeeIdFieldInTableIsDisplayed();
}
//@Then("Check Net Sales Field in Table is Displayed")
//public void checkNetSalesFieldInTableIsDisplayed() {
//    // Write code here that turns the phrase above into concrete actions
//    repts.IcheckNetSalesFieldInTableIsDisplayed();
//}

@Then("Check Hours in Table is Displayed")
public void checkHoursInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckHoursInTableIsDisplayed();
}

@Then("Check Labor in Table is Displayed")
public void checkLaborInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckLaborInTableIsDisplayed();
}


@Then("Check % of Net Sales Field in Table is Displayed")
public void checkOfNetSalesFieldInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckOfNetSalesFieldInTableIsDisplayed();
}
@Then("Check Labor Percentage Field in Table is Displayed")
public void checkLaborPercentageFieldInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckLaborPercentageFieldInTableIsDisplayed();
}
@Then("Check Shift Status Field in Table is Displayed")
public void checkShiftStatusFieldInTableIsDisplayed() {
    // Write code here that turns the phrase above into concrete actions
    repts.IcheckShiftStatusFieldInTableIsDisplayed();
}

@Given("I select Employee as All")
public void iSelectEmployeeAsAll() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectEmployeeAsAll();
}

@Given("I select Process as Daily\\/Weekly")
public void iSelectProcessAsDailyWeekly() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectProcessAsDailyWeekly();
}

@Given("I select Format as In Hours")
public void iSelectFormatAsInHours() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectFormatAsInHours();
}

@Given("I select Active\\/Inactive as All")
public void iSelectActiveInactiveAsAll() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectActiveInactiveAsAll();
}

@Given("I select Shift Status as All")
public void iSelectShiftStatusAsAll() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectShiftStatusAsAll();
}

@Given("I select Time Period as Date Range")
public void iSelectTimePeriodAsDateRange() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    repts.Select_Date_Range_TimePeriod("22-01-2024","09-02-2024");
}

@Given("I Click Apply button")
public void iClickApplyButton() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	repts.iClickApplyButton();
}

@Then("Verify Employee Labor Report Availble for Process DW, InHours, DateRange")
public void verifyEmployeeLaborReportAvailbleForProcessDWInHoursDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Given("I select Active\\/Inactive as Active")
public void iSelectActiveInactiveAsActive() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectActiveInactiveAsActive();
}

@Given("I select Active\\/Inactive as Inactive")
public void iSelectActiveInactiveAsInactive() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectActiveInactiveAsInactive();
}


@Given("I select Shift Status as In Shift")
public void iSelectShiftStatusAsInShift() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectShiftStatusAsInShift();
}

@Given("I select Shift Status as Shift Closed")
public void iSelectShiftStatusAsShiftClosed() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectShiftStatusAsShiftClosed();
}

@Given("I select Format as In Time")
public void iSelectFormatAsInTime() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectFormatAsInTime();
}

@Given("I select Process as Daily")
public void iSelectProcessAsDaily() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectProcessAsDaily();
}

@Given("I select Time Period as Today")
public void iSelectTimePeriodAsToday() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsToday();
}

@Then("Verify Employee Labor Report Availble for Process Daily, Today")
public void verifyEmployeeLaborReportAvailbleForProcessDailyToday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Given("I select Time Period as Yesterday")
public void iSelectTimePeriodAsYesterday() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsYesterday();
}
@Then("Verify Employee Labor Report Availble for Process Daily, Yesterday")
public void verifyEmployeeLaborReportAvailbleForProcessDailyYesterday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Given("I select Time Period as This Week")
public void iSelectTimePeriodAsThisWeek() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsThisWeek();
}

@Then("Verify Employee Labor Report Availble for Process Daily, This Week")
public void verifyEmployeeLaborReportAvailbleForProcessDailyThisWeek() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Given("I select Time Period as Last Week")
public void iSelectTimePeriodAsLastWeek() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsLastWeek();
}
@Then("Verify Employee Labor Report Availble for Process Daily, Last Week")
public void verifyEmployeeLaborReportAvailbleForProcessDailyLastWeek1() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

//@Given("I select Time Period as Last {int} Days")
//public void iSelectTimePeriodAsLastDays1(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    repts.iSelectTimePeriodAsLastNDays();
//}

@Given("I select Time Period as This Month")
public void iSelectTimePeriodAsThisMonth() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsThisMonth();
}
@Then("Verify Employee Labor Report Availble for Process Daily, This Month")
public void verifyEmployeeLaborReportAvailbleForProcessDailyThisMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Given("I select Time Period as Last Month")
public void iSelectTimePeriodAsLastMonth() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsLastMonth();
}
@Then("Verify Employee Labor Report Availble for Process Daily, Last Month")
public void verifyEmployeeLaborReportAvailbleForProcessDailyLastMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

//@Then("Verify Employee Labor Report Availble for Process Daily, Last {int} Days")
//public void verifyEmployeeLaborReportAvailbleForProcessDailyLastDays(Integer int1) throws InterruptedException {
//    // Write code here that turns the phrase above into concrete actions
//	repts.IverifyEmployeeLabor_report();
//}

@Given("I select Time Period as Specific Date")
public void iSelectTimePeriodAsSpecificDate() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectTimePeriodAsSpecificDate("01-02-2024");
}
@Then("Verify Employee Labor Report Availble for Process Daily, Specific Date")
public void verifyEmployeeLaborReportAvailbleForProcessDailySpecificDate() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}


@Then("Verify Employee Labor Report Availble for Process Daily, Date Range")
public void verifyEmployeeLaborReportAvailbleForProcessDailyDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Given("I select Process as Weekly")
public void iSelectProcessAsWeekly() {
    // Write code here that turns the phrase above into concrete actions
    repts.iSelectProcessAsWeekly();
}
@Then("Verify Employee Labor Report Availble for Process Weekly, Today")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyToday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Yesterday")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyYesterday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, This Week")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyThisWeek() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Last Week")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLastWeek() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

//@Then("Verify Employee Labor Report Availble for Process Weekly, Last {int} Days")
//public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLastDays(Integer int1) throws InterruptedException {
//    // Write code here that turns the phrase above into concrete actions
//	repts.IverifyEmployeeLabor_report();
//}

@Then("Verify Employee Labor Report Availble for Process Weekly, This Month")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyThisMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Last Month")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLastMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Specific Date")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklySpecificDate() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}


@Then("Verify Employee Labor Report Availble for Process Weekly, Date Range")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}


@Then("Verify Employee Labor Report Available for Process DW, InHours, Active, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInHoursActiveDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InHours, Inactive, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInHoursInactiveDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InHours, In Shift, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInHoursInShiftDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InHours, Shift Closed, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInHoursShiftClosedDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process DW, InTime, DateRange")
public void verifyEmployeeLaborReportAvailbleForProcessDWInTimeDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InTime, Active, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInTimeActiveDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InTime, Inactive, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInTimeInactiveDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InTime, In Shift, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInTimeInShiftDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Available for Process DW, InTime, Shift Closed, DateRange")
public void verifyEmployeeLaborReportAvailableForProcessDWInTimeShiftClosedDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    repts.IverifyEmployeeLabor_report();
}

@Given("I select Time Period as Last_NDays")
public void iSelectTimePeriodAsLastNDays() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectTimePeriodAsLastNDays();
	repts.Select_Last_N_Days_TimePeriod("5");
}

@Then("Verify Employee Labor Report Availble for Process Daily, Last_NDays")
public void verifyEmployeeLaborReportAvailbleForProcessDailyLastNDays() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Last_NDays")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLastNDays() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}


@Given("I select Time Period as Last_7Days")
public void iSelectTimePeriodAsLast7Days() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectTimePeriodAsLast7days();
}

@Given("I select Time Period as Last_30Days")
public void iSelectTimePeriodAsLast30Days() {
    // Write code here that turns the phrase above into concrete actions
	repts.iSelectTimePeriodAsLast30days();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Today")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyToday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Yesterday")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyYesterday() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, This Week")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyThisWeek() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Last Week")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyLastWeek() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily, Last_7Days")
public void verifyEmployeeLaborReportAvailbleForProcessDailyLast7Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Last_7Days")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLast7Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily, Last_30Days")
public void verifyEmployeeLaborReportAvailbleForProcessDailyLast30Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Weekly, Last_30Days")
public void verifyEmployeeLaborReportAvailbleForProcessWeeklyLast30Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Last_7Days")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyLast7Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, This Month")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyThisMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Last Month")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyLastMonth() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Last_30Days")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyLast30Days() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Specific Date")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklySpecificDate() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Date Range")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyDateRange() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

@Then("Verify Employee Labor Report Availble for Process Daily\\/Weekly, Last_NDays")
public void verifyEmployeeLaborReportAvailbleForProcessDailyWeeklyLastNDays() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	repts.IverifyEmployeeLabor_report();
}

}
	

	

