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

WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/LAUNCH_Button'))

'Click on Username in the navbar'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Username'))

'Click on User profile option'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/User_Profile'))

'Click on First name field'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Firstname_Field'))

'Click on Last name field\r\n'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Lastname_Field'))

'Enter phone number'
WebUI.setText(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Phone_Field'), '123')

'Email field is not editable'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Email_Disabled_Field'))

'Click Apply changes in personal profile'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Apply Changes_Button'))

'Click on Username in the navbar'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Username'))

'Click on User profile option'
WebUI.click(findTestObject('UserProfileModule/UserProfile/Page_Daboo/User_Profile'))

'Click on Organizational profile option '
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Organizational_Profile_Option'))

'Click on upload image icon'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Upload_Image_Button'))

'Click on Apply Changes button in organizational profile'
WebUI.click(findTestObject('Object Repository/UserProfileModule/UserProfile/Page_Daboo/Apply_Changes_ButtonOrg'))

