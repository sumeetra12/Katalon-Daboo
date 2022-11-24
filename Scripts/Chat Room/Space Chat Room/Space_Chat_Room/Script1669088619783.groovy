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

WebUI.maximizeWindow()

'Enter email'
WebUI.setText(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/Email_field'), 'sumeetramhrjn123@gmail.com')

'Enter password'
WebUI.setEncryptedText(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/Password_field'), 'cvW8qx4B2o3F4VwP/kNsqA==')

'Click on Sign in button'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Sign In'))

'Click on LAUNCH button'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_LAUNCH'))

'Click on space chat name'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/Space_name'))

'Click on space chat button'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/Space_button'))

'Click on space chat profile'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/Space_Profile'))

'Click on Meet to start video conferencing'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Meet (Beta)'))

'Click on shared files'
WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Shared Files'))

WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Shared Photos'))

WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Polls'))

WebUI.click(findTestObject('Object Repository/SpaceChatRoom/Page_Daboo/button_Chat'))

