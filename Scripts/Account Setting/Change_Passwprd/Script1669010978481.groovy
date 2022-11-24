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

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Email_mantine-zphfyaqfw'), 'sumeetramhrjn123@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Password_mantine-ne9v178t0'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/span_Sign In'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/div_LAUNCH'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/div_1 MaharjnUSER'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/div_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Password_mantine-k4u6dvp5p'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Password_mantine-k4u6dvp5p'), Keys.chord(
        Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_New Password_mantine-qzo0xke3j'), 
    'nlN1vlq08xKEwJ8Ukf/evg==')

WebUI.sendKeys(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_New Password_mantine-qzo0xke3j'), Keys.chord(
        Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Confirm Password_mantine-ey040psgo'), 
    'nlN1vlq08xKEwJ8Ukf/evg==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/span_Update Password'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/div_1 MaharjnUSER'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/div_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Password_mantine-4kgjx7mm3'), 'nlN1vlq08xKEwJ8Ukf/evg==')

WebUI.sendKeys(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Password_mantine-4kgjx7mm3'), Keys.chord(
        Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_New Password_mantine-9nxdnlscq'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.sendKeys(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_New Password_mantine-9nxdnlscq'), Keys.chord(
        Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Daboo/input_Confirm Password_mantine-m8skv4nsk'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Daboo/span_Update Password'))

