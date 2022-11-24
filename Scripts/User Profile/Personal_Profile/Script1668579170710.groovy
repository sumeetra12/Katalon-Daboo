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
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/LAUNCH_Button'))

'Click on username image in navbar'
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/Username_img'))

'Click on Userprofile img '
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/UserProfile_img'))

'Click on first name field'
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/First name_field'))

'Click on last name field'
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/Last name_Field'))

WebUI.setText(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/Phone_Field'), '123')

'Email can not be edited'
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/Email_Disabled_Field'))

'Click on apply changes button'
WebUI.click(findTestObject('Object Repository/UserProfileModule/PersonalProfile/Page_Daboo/Apply Changes_Button'))

WebUI.closeBrowser()

