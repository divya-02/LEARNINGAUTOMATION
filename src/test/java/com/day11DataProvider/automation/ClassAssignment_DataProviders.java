package com.day11DataProvider.automation;

import org.testng.annotations.DataProvider;

public class ClassAssignment_DataProviders {
	@DataProvider(name = "TutorialsNinja")
    public Object[][] getTNData() {

		Object[][] data = { { "pateldivya301@gmail.com", "Qwerty@123" },};
        return data;
	}
}
