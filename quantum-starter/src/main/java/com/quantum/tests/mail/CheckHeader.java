package com.quantum.tests.mail;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.TestBaseProvider;
import com.qmetry.qaf.automation.data.MetaData;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.pages.MailPage;
import com.quantum.utils.DeviceUtils;
import com.quantum.utils.DriverUtils;

public class CheckHeader extends WebDriverTestCase {

	
	@Test(groups = { "regression" })
	public void checkHeader() {
		MailPage cp = new MailPage();
		cp.checkHead();
		

	}

}
