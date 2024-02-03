package coding;

import java.io.FileInputStream;

public class FileReading {

	public static void main(String[] args) {
		String file="./TestData/data.xlsx";
		FileInputStream fis= new FileInputStream(file);
		XSSWorkbook workbook=new XSSWorkbook(fis);
		XSSSheet sheet=workbook.getSheetAt(0)
		

	}

}
