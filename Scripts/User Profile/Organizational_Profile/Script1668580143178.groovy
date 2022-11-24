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

WebUI.callTestCase(findTestCase('Login/Login_Page'), [:])

'Click LAUNCH button on side of organization name'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/LAUNCH_Button'))

'Click on username img in navbar'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/Username_img'))

'Click on Userprofile img option'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/Userprofile_img'))

'Click on Organizational Profile option'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/Organizational Profile_Option'))

'Click on upload img icon'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/Upload_img_Icon'))

'Click on Apply changes button'
WebUI.click(findTestObject('Object Repository/UserProfileModule/OrganizationalProfile/Page_Daboo/Apply Changes_Button'))

