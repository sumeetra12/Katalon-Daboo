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
WebUI.setText(findTestObject('Object Repository/SpaceDetails/Page_Daboo/input_Email_mantine-oqjbz2ndq'), 'sumeetramhrjn123@gmail.com')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/SpaceDetails/Page_Daboo/input_Password_mantine-1vmezepls'), 'cvW8qx4B2o3F4VwP/kNsqA==')

'Click on Sign in button'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/span_Sign In'))

'Click on LAUNCH button'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/div_LAUNCH'))

'Click on available chat option in space'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/div_GGenerallllllly'))

'Click on available chat option in space'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/div_Generallllllly'))

WebUI.click(findTestObject('SpaceChatRoom/Page_Daboo/button_Shared Files'))

'Click on icon on side of members'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/svg_Generallllllly_pointer action-button'))

'Click on Space Details'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/div_Space Details'))

'Click on Members'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/div_Members'))

'Click on close window icon'
WebUI.click(findTestObject('Object Repository/SpaceDetails/Page_Daboo/svg'))

WebUI.closeBrowser()

