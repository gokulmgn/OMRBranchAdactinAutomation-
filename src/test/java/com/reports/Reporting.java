package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		File file = new File("C:\\Users\\gokul\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");

		Configuration configuration = new Configuration(file, "OMRBranchAdactinAutomation");

		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("browser", "104");
		configuration.addClassifications("OS", "Windows11");
		configuration.addClassifications("Sprint", "34");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}
}
