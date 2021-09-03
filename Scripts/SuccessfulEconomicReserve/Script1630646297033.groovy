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

WebUI.click(findTestObject('reservation/cityInput', [('field') : from, ('index') : 2]))

WebUI.setText(findTestObject('reservation/cityInput', [('field') : from, ('index') : 2]), findTestData('Reservation').getValue(
        'fromCity', 1))

WebUI.click(findTestObject('reservation/SelectCityList', [('index') : 1]))

WebUI.click(findTestObject('reservation/cityInput', [('field') : to, ('index') : 5]))

WebUI.setText(findTestObject('reservation/cityInput', [('field') : to, ('index') : 5]), findTestData('Reservation').getValue(
        'toCity', 1))

WebUI.click(findTestObject('reservation/SelectCityList', [('index') : 2]))

WebUI.click(findTestObject('reservation/dateDepartureInput'))

WebUI.waitForElementClickable(findTestObject('reservation/calenderDepartureDiv', [('value') : findTestData('Reservation').getValue(
                'dataDeparture', 1)]), 0)

WebUI.click(findTestObject('reservation/calenderDepartureDiv', [('value') : findTestData('Reservation').getValue('dataDeparture', 
                1)]))

WebUI.click(findTestObject('reservation/dateBackInput'))

WebUI.waitForElementClickable(findTestObject('reservation/calenderDepartureDiv', [('value') : findTestData('Reservation').getValue(
                'dataBack', 1)]), 0)

WebUI.click(findTestObject('reservation/calenderDepartureDiv', [('value') : findTestData('Reservation').getValue('dataBack', 
                1)]))

WebUI.click(findTestObject('reservation/searchButton'))

