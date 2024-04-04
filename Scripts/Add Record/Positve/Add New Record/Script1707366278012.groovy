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
import java.util.UUID as UUID
import java.util.Random as Random

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/span_Add New Record'))

String randomNumber = (100 + new Random().nextInt(9000)).toString()
String formattedRandomNumber = 'NDS - Wildan - ' + randomNumber
WebUI.sendKeys(findTestObject('Object Repository/Add New Record/Page_/input__Employee_ID'), formattedRandomNumber)

WebUI.setText(findTestObject('Object Repository/Add New Record/Page_/input__Employee_Name'), 'Muhammad Wildan Zul Ali')

WebUI.setText(findTestObject('Object Repository/Add New Record/Page_/input__Date_Birth'), '03-06-1990')

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/input_No_App.isMerried_Group'))

WebUI.setText(findTestObject('Object Repository/Add New Record/Page_/input__FK_District_Code'), 'TANGE')

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/li_D001 - Tangerang'))

//WebUI.setText(findTestObject('Object Repository/Add New Record/Page_/input__FK_District_Code'), 'D001 - Tangerang')
WebUI.click(findTestObject('Object Repository/Add New Record/Page_/input__ContentPlaceHolder1_FK_Multi_Distric_c8093b'))

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/span_Cell value has been edited_x-grid-checkcolumn'))

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/div_Picker_tool-1038-toolEl'))

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Add New Record/Page_/span_Data Saved into Database'), 'Data Saved into Database.')

WebUI.click(findTestObject('Object Repository/Add New Record/Page_/span_OK'))

