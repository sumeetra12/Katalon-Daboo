import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on LAUNCH button'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/button_LAUNCH'))

'Click on Drop down button on side of organization name on top leftside'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/Dropdown_button'))

'Click on QA option'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/QA_Option'))

'click on drop down option'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/Dropdown_button'))

'Click on QATESTER option'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/QATESTER_Option'))

'Click on Drop down option'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/Dropdown_button'))

'Click on test@yopmail.com option'
WebUI.click(findTestObject('Object Repository/SwitchOrganization/Page_Daboo/testyopmail.com_Option'))

WebUI.closeBrowser()

