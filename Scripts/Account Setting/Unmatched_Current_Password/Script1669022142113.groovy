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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.dev.daboospace.com/sign-in')

'Enter Email'
WebUI.setText(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_Email_mantine-1owk4276d'), 
    'sumeetramhrjn123@gmail.com')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_Password_mantine-3rbveh45f'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

'Click on Sign in button'
WebUI.click(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/span_Sign In'))

'Click on LAUNCH button'
WebUI.click(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/div_LAUNCH'))

'Click on User profile'
WebUI.click(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/div_1 MaharjnUSER'))

'Click on Change Password option'
WebUI.click(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/div_Change Password'))

'Enter current password'
WebUI.setEncryptedText(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_Password_mantine-7nv8d6lvy'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.sendKeys(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_Password_mantine-7nv8d6lvy'), 
    Keys.chord(Keys.ENTER))

'Create New Password'
WebUI.setEncryptedText(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_New Password_mantine-dafpf94e4'), 
    'nlN1vlq08xKEwJ8Ukf/evg==')

WebUI.sendKeys(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_New Password_mantine-dafpf94e4'), 
    Keys.chord(Keys.ENTER))

'Re-enter new password'
WebUI.setEncryptedText(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/input_Confirm Password_mantine-9y5zf91qh'), 
    'nlN1vlq08xKEwJ8Ukf/evg==')

WebUI.click(findTestObject('Object Repository/AccountSetting/UnmatchedCurrentPassword/Page_Daboo/span_Update Password'))

WebUI.closeBrowser()

