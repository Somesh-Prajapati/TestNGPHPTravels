package GenericLibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handle_ExcelOPerations {

	public static void Create_New_Excel_File() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
        FileOutputStream fos = new FileOutputStream("D:\\MyExcel.xlsx");
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        System.out.println("File Created");
        sheet.createRow(0);
        workbook.write(fos);
        fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		Create_New_Excel_File();
	}
}
