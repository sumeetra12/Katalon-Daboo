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

WebUI.setText(findTestObject('Object Repository/spaces/Page_Daboo/input_Email_mantine-knog1pb2w'), 'sumeetramhrjn123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/spaces/Page_Daboo/input_Password_mantine-i3nz1256z'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/spaces/Page_Daboo/span_Sign In'))

WebUI.click(findTestObject('Object Repository/spaces/Page_Daboo/button_LAUNCH'))

WebUI.click(findTestObject('Object Repository/spaces/Page_Daboo/div_GGenerallllllly'))

WebUI.click(findTestObject('Object Repository/spaces/Page_Daboo/div_2 Members'))

WebUI.click(findTestObject('Object Repository/spaces/Page_Daboo/svg_Generallllllly_pointer action-button'))

