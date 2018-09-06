
package utility;
/**
 * @author suman
 * @Date 31/08/2018
 * @Purpose opening a html file like extent report
 *
 */
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class OpenReport
{
	public static String addr;
	//setting the address of the html file
	public OpenReport(String addr)
	{
		this.addr=addr;
	}
	//opening the html file
	public static void open()
	{
		File htmlFile = new File(addr);
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

