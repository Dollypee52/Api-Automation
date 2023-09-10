//package api.utilities;
//
//import java.io.FileInputStream;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//
//public class XLUtility {
//	public FileInputStream fi;
//	public FileInputStream fo;
//	public XSSWorkbook workbook;
//	public XSSFSheet sheet;
//	public XSSFCell cell;
//	public XSSFRow row;
//	public CellStyle;
//	String path;
//	
//public XLUtility(String path) {
//	this.path=path;
//}
//
//public int getRowCount(String sheerName) throws IOException{
//	fi=new FileInputStream(path);
//	workbook=new XSSFWorkbook(fi);
//	sheet=workbook.getSheet(sheetName);
//	int rowcount=sheet.getLastRowNum();
//	workbook.close();
//	fi.close();
//	return rowcount;
//}
//
//public int getCellCount(String sheetName., int rownum)
//}
