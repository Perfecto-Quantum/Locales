/**
 * 
 */
package com.quantum.pages;

import java.util.Properties;

import org.openqa.selenium.By;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.PropertyUtil;
import com.quantum.utils.ConsoleUtils;
import com.quantum.utils.DeviceUtils;
import com.quantum.utils.DriverUtils;

/**
 * @author chirag.jayswal
 *
 */
@QAFTestStepProvider
public class MailPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	PropertyUtil props = ConfigurationManager.getBundle();
	
	public void checkHead()
	{

		DriverUtils.getDriver().findElement(By.xpath("//*[@label='" + props.getString("mail.header") + "']")).isPresent();
	
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	

}
