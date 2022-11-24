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

'Enter Email.'
WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/Email_Field'), 'sumeetramhrjn123@gmail.com')

'Enter password'
WebUI.setEncryptedText(findTestObject('Object Repository/Polls/Page_Daboo/Password_Field'), 'cvW8qx4B2o3F4VwP/kNsqA==')

'Click on Sign in button'
WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Sign In'))

'Click on LAUNCH button'
WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_LAUNCH'))

WebUI.click(findTestObject('Polls/Page_Daboo/div_Generallllllly'))

WebUI.click(findTestObject('SpaceDetails/Page_Daboo/div_GGenerallllllly'))

'Clcik on Polls button'
WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Polls'))

'Click on Create button'
WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Create a Poll'))

'Enter you question in Question field'
WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/Question_Field'), 'How was your day today?')

'Set the end date of the poll'
WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/Poll End Date_date'))

'Click on calendar button'
WebUI.click(findTestObject('Polls/Page_Daboo/button_Calendar'))

WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/am_pm_option'), 'pm')

WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/Pick time_Field'), '12')

WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/Answer_Option1'), 'Fine')

WebUI.setText(findTestObject('Object Repository/Polls/Page_Daboo/Answer_Option2'), 'Very bad')

WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Create'))

WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Publish'))

WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Drafts'))

WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Disabled'))

WebUI.click(findTestObject('Object Repository/Polls/Page_Daboo/button_Expired'))

WebUI.closeBrowser()

