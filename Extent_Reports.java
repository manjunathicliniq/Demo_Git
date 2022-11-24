package learn_Aotmation_Online;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Reports {

public static void main(String[] args) {
	
	
	ExtentSparkReporter rep = new ExtentSparkReporter("Report.html");
	ExtentReports Extent = new ExtentReports();
	
	Extent.attachReporter(rep);
	
	ExtentTest test = Extent.createTest("Test");
	
	test.pass("pass");
	
	
	
	

}	
}
