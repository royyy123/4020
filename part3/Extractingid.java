package part3;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.LinkedList;
public class Extractingid {
	public static void main(String[] args) {
		try {
	         File inputFile = new File("/Users/royrao/Documents/java1620/Assign1-4020/src/part3/new.xml");
//	         System.out.println(inputFile.canRead());
	         SAXParserFactory factory = SAXParserFactory.newInstance();
	         SAXParser saxParser = factory.newSAXParser();
	         Userhandler userhandler = new Userhandler();
	         saxParser.parse(inputFile, userhandler);   
	         System.out.println(userhandler.getId());
//	         System.out.println("ss");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
