package homework12.task2;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Helper {
    public static String getJsonArrayFromXls(String path, String sheetName) throws IOException {
        InputStream stream=new FileInputStream(new File(path));
        Workbook workbook=new XSSFWorkbook(stream);
        Sheet sheet=workbook.getSheet(sheetName);
        final List<Map<String,String>> data=getDataFromSheet(sheet);
        XmlMapper mapper=new XmlMapper();
        return  mapper.writeValueAsString(data);
    }

    public static String getXmlFromXls(String path, String sheetName){}
}
    private static List<Map<String, String>> getDataFromSheet(Sheet sheet) {
    }