package DataProvider.Resouces;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderFromExcel {
	public static ArrayList<DataProviderExcel> GetDataFromExcel() throws IOException {
		DataProviderExcel exceldata;
		ArrayList<DataProviderExcel> obj = new ArrayList<>();
		String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\TestNGExcel.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int rowIndex  = 1 ;rowIndex<=sheet.getLastRowNum();rowIndex++) {
			Row row = sheet.getRow(rowIndex);
			Cell firstname = row.getCell(1);
			Cell lastname = row.getCell(2);
			Cell school = row.getCell(3);
			Cell college = row.getCell(4);
			Cell address = row.getCell(5);
			exceldata = new DataProviderExcel(firstname.toString(), lastname.toString(), school.toString(), college.toString(), address.toString());
			obj.add(exceldata);
		}
		workbook.close();
		fis.close();
		return obj;
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<DataProviderExcel> list =  DataProviderFromExcel.GetDataFromExcel();
		for (int i = 0; i < list.size(); i++) {
			DataProviderExcel person = list.get(i);
			System.out.println(person.getFirstname());
			System.out.println(person.getLastname());
			System.out.println(person.getSchoolname());
			System.out.println(person.getCollegename());
			System.out.println(person.getAddressname());
		}
	}
}
