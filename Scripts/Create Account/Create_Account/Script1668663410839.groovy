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

WebUI.navigateToUrl('https://www.dev.daboospace.com/')

'click on create an account'
WebUI.click(findTestObject('Object Repository/CreateAccount/Page_Daboo/button_Create an account'))

'Enter email '
WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Daboo/Admin Email_field'), 'test@yopmail.com')

'Enter first name'
WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Daboo/First name_field'), 'test')

'Enter Last name'
WebUI.setText(findTestObject('Object Repository/CreateAccount/Page_Daboo/Last name_field'), 'system')

'Create password'
WebUI.setEncryptedText(findTestObject('Object Repository/CreateAccount/Page_Daboo/Password_field'), 'cvW8qx4B2o3F4VwP/kNsqA==')

'Click on register button'
WebUI.click(findTestObject('Object Repository/CreateAccount/Page_Daboo/button_Register in Daboospace'))

