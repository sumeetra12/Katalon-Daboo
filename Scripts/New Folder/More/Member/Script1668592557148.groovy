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

'Click on QA LAUNCH button'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/button_LAUNCH'))

'Click dropdown button on the side of organization name'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Dropdown button'))

'CLick on Member Option'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Members_Option'))

'Table with Username should be displayed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Username'))

'Table with Email should be displayed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Email'))

'Table with Designation should be displayed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Designation'))

'Table with Role of the member should be dispalyed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Role'))

'Click on Pending option'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Pending_Option'))

'Table with Username should be dispalyed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/PUsername'))

'Table with Email should be dispalyed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/PEmail'))

'Table with Status should be displayed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Status'))

'Resend Invitation button should be displayed'
WebUI.click(findTestObject('Object Repository/Members/Page_Daboo/Resend Invitation_Button'))

WebUI.closeBrowser()

