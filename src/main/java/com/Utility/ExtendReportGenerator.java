package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\neveh\\eclipse-workspace\\Framework\\Reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Framwork_Report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Framework_project");
		extent.setSystemInfo("o.s", "Windows");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("Q.A", "Harshu");
		return extent;
	}

}
