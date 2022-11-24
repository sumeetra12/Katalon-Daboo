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

WebUI.setText(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/Email_Field'), 'sumeetramhrjn123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/Password_Field'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/button_LAUNCH'))

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/Private Chat Options'))

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/button_Meet (Beta)'))

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/button_Shared Files'))

WebUI.click(findTestObject('Object Repository/PrivateChatRoom/Page_Daboo/button_Shared Photos'))

WebUI.closeBrowser()

