import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\SHADHIN\\Desktop\\test.xlsx"));
            XSSFSheet sheet = wb.getSheetAt(0);
            for (int i = 0 ; i< sheet.getLastRowNum();i++){
                Row r;
                Cell c;
                r = sheet.getRow(i);
                c = r.getCell(0);
                System.out.println(c.toString());
            }


            // "2.534"+2

            //double number = Double.parseDouble(c.toString());

          //  number = number + 2;

          //  System.out.println(number);


        } catch (Exception e) {

        }


    }
}