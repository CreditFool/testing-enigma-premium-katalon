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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.premium.enigmacamp.com/auth/login')

WebUI.verifyElementNotClickable(findTestObject('Page_Login/Page_Premium Class/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Page_Login/Page_Premium Class/span_Invalid Email address'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Premium Class/input_Email_email'), 'bukanEmail')

WebUI.verifyElementPresent(findTestObject('Page_Login/Page_Premium Class/span_Invalid Email address'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Premium Class/input_Email_email'), 'email@benar.com')

WebUI.verifyElementNotPresent(findTestObject('Page_Login/Page_Premium Class/span_Invalid Email address'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Premium Class/input_Password_password'), 'kurang')

WebUI.verifyElementPresent(findTestObject('Page_Login/Page_Premium Class/span_The Password must have at least 8 characters'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Premium Class/input_Password_password'), 'salahFormat')

WebUI.verifyElementPresent(findTestObject('Page_Login/Page_Premium Class/span_Password must contain one digit, lowercase, uppercase and special character'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Premium Class/input_Password_password'), 'passwordBagus#1')

WebUI.verifyElementNotPresent(findTestObject('Page_Login/Page_Premium Class/span_Password must contain one digit, lowercase, uppercase and special character'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Premium Class/i_Password_bi bi-eye'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Premium Class/i_Password_bi bi-eye'))

WebUI.closeBrowser()

