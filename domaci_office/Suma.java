package domaci_office;

/*
 * Napisati program koji racuna sumu brojeva koji se nalaze u prvom worksheet-u Excel tabele
 * koji se zove Brojevi. U tabeli se svi brojevi nalaze u prvoj koloni.
 * Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu. 
 * Krajnju sumu nakon toga treba da ispise u konzoli. 
 * Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva (isprobati!)
 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Suma {

	public static void noviRed_DodajBroj(double vrednost) throws IOException {

		double vrednostReda = vrednost;

		FileInputStream fis = new FileInputStream("C:\\Poi\\Data (DOM).xls");

		HSSFWorkbook wb = new HSSFWorkbook(fis);

		HSSFSheet sheet = wb.getSheetAt(0);

		int brojReda = sheet.getLastRowNum();

		Row row1 = sheet.createRow(brojReda + 1);

		Cell cell1 = row1.createCell(0);

		cell1.setCellValue(vrednostReda);

		fis.close();

		FileOutputStream fos = new FileOutputStream("C:\\Poi\\Data (DOM).xls");

		wb.write(fos);
		fos.close();

	}

	public static void ispisSume() throws IOException {

		double x;

		double y = 0.0;

		FileInputStream fis = new FileInputStream("C:\\Poi\\Data (DOM).xls");

		HSSFWorkbook wb = new HSSFWorkbook(fis);

		HSSFSheet sheet = wb.getSheetAt(0);

		System.out.println("Brojevi u tabeli su: ");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {

			Row row = sheet.getRow(i);

			if (row != null) {

				Cell cell = row.getCell(0);

				if (cell != null) {

					x = cell.getNumericCellValue();

					y += x;

					System.out.println(x);

				}

			}

		}

		System.out.println("-------Zbir brojeva je " + y);

		wb.close();

	}

	public static void main(String[] args) throws IOException {
		
		
		

		noviRed_DodajBroj(10);
		noviRed_DodajBroj(8);

	ispisSume();

	}

}
