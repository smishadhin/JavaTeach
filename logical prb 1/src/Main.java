// Write a java program to find the largest and smallest of three numbers.
// Then find if that largest/smallest number is negative or positive.

// Then find if that smallest or largest number is a solid integer or a decimal.
// if that number is decimal the find out the decimal point number count.

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

//note: use only one array variable numbers[] = {6, 8.54, 2.33} to store the numbers..... no other variable can be intruduced ever
// use method......  one for large/small...one for neg pos,,,,one for decimal integer,,,,,one for decimal count
public class Main {
    double[] Numbers = new double[3];

    public static void main(String[] args) throws IOException {
        System.out.println("Numbers are:");
        Main obj = new Main();
        try {
            XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\SHADHIN\\Desktop\\test.xlsx"));
            XSSFSheet sheet = wb.getSheetAt(0);
            // System.out.println("col:"+sheet.getRow(1).getCell(0));

            for (int a = 0; a <= sheet.getLastRowNum(); a++) {
                for (int b = 0; b < sheet.getRow(a).getLastCellNum(); b++) {
                    if (sheet.getRow(a).getCell(b).toString().equals("Numbers")) {
                        int index = 0;
                        for (int i = sheet.getRow(a).getRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                            Row r;
                            Cell c;
                            r = sheet.getRow(i);
                            c = r.getCell(b);
                            System.out.println(c.toString());

                            obj.Numbers[index] = Double.parseDouble(c.toString());
                            index++;
                        }
                    } else {

                    }
                }
            }


        } catch (Exception e) {
        }
        System.out.println("Calculation bellow:");
        obj.LargeAndSmall();
    }

    void WriteExcel(double large, double small) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\SHADHIN\\Desktop\\test.xlsx"));
        XSSFSheet sheet = wb.getSheetAt(0);

        for (int a = 0; a <= sheet.getLastRowNum(); a++) {
            // System.out.println(sheet.getRow(a).getLastCellNum());
            for (int b = 0; b < sheet.getRow(a).getLastCellNum(); b++) {
                // System.out.println("ct  "+sheet.getRow(a).getCell(b));
                if (sheet.getRow(a).getCell(b) == null) {
                    continue;
                }
                if (sheet.getRow(a).getCell(b).toString().equals("Largest")) {
                    // System.out.println("found");
                    // System.out.println("lc"+ sheet.getRow(a+1).getLastCellNum());
                    sheet.getRow(a + 1).createCell(b).setCellValue(large);

                    FileOutputStream out = new FileOutputStream(new File("C:\\Users\\SHADHIN\\Desktop\\test.xlsx"));
                    wb.write(out);

                }

                if (sheet.getRow(a).getCell(b).toString().equals("Smallest")) {
                    // System.out.println("found");
                    // System.out.println("lc"+ sheet.getRow(a+1).getLastCellNum());
                    sheet.getRow(a + 1).createCell(b).setCellValue(small);

                    FileOutputStream out = new FileOutputStream(new File("C:\\Users\\SHADHIN\\Desktop\\test.xlsx"));
                    wb.write(out);

                }


            }
        }

    }

    public void LargeAndSmall() throws IOException {

        double large = 0, small=0;

        if (Numbers[0] > Numbers[1] && Numbers[0] > Numbers[2]) {
            System.out.println("The largest number ::" + Numbers[0]);
            large = Numbers[0];
            PositiveOrNegative(Numbers[0]);
            IntegerOrDecimal(Numbers[0]);
            WriteExcel(large, small);

        } else if (Numbers[0] < Numbers[1] && Numbers[0] < Numbers[2]) {
            System.out.println("The smallest number ::" + Numbers[0]);
            small = Numbers[0];
            PositiveOrNegative(Numbers[0]);
            IntegerOrDecimal(Numbers[0]);
            WriteExcel(large, small);
        }

        if (Numbers[1] > Numbers[0] && Numbers[1] > Numbers[2]) {
            System.out.println("The largest number ::" + Numbers[1]);
            large = Numbers[1];
            PositiveOrNegative(Numbers[1]);
            IntegerOrDecimal(Numbers[1]);
            WriteExcel(large, small);
        } else if (Numbers[1] < Numbers[0] && Numbers[1] < Numbers[2]) {
            System.out.println("The smallest number ::" + Numbers[1]);
            PositiveOrNegative(Numbers[1]);
            IntegerOrDecimal(Numbers[1]);
            small = Numbers[1];
            WriteExcel(large, small);
        }

        if (Numbers[2] > Numbers[1] && Numbers[2] > Numbers[0]) {
            System.out.println("The largest number ::" + Numbers[2]);
            large = Numbers[2];
            PositiveOrNegative(Numbers[2]);
            IntegerOrDecimal(Numbers[2]);
            WriteExcel(large, small);
        } else if (Numbers[2] < Numbers[1] && Numbers[2] < Numbers[0]) {
            System.out.println("The smallest number ::" + Numbers[2]);
            PositiveOrNegative(Numbers[2]);
            IntegerOrDecimal(Numbers[2]);
            small = Numbers[2];
            WriteExcel(large, small);
        }
    }


    public void PositiveOrNegative(double pn) {
        if (pn > 0) {
            System.out.println(pn + " number is positive");
        } else {
            System.out.println(pn + " number is negative");
        }

    }

    public void IntegerOrDecimal(double id) {

        if (id % 1 != 0) {
            System.out.println(id + " number is Decimal");
            DecimalCount(id);
        } else {
            System.out.println(id + " number is Integer");
        }

    }

    public void DecimalCount(double dc) {

        String text = Double.toString(Math.abs(dc));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;

        System.out.println("The decimal point number count :  " + decimalPlaces);

    }
}