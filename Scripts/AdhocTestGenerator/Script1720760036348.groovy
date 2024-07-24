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
//additional imports
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.Integer as Integer

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/AdHocTest/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/AdHocTest/Page_Frameworks (Demo)/input_Password_password'), 'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/AdHocTest/Page_Frameworks (Demo)/div_Login'))

WebUI.rightClick(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/td_Save (S)2'))

WebUI.click(findTestObject('Object Repository/AdHocTest/Page_Frameworks (Demo)/td_Branch Transfer Sales Order Details'))

WebUI.rightClick(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/td_Save (S)2'))

WebUI.rightClick(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/td_Save (S)2'))

WebUI.click(findTestObject('Object Repository/AdHocTest/Page_Frameworks (Demo)/td_Branch Transfer Sales Order Details'))

WebUI.rightClick(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/img_SaveIcon2'))

WebUI.rightClick(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/td_Save (S)2'))

