package part3;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.LinkedList;
import java.util.ArrayList;
public class Userhandler extends DefaultHandler{
	
private boolean hasid=false;	
public LinkedList id= new LinkedList();
private String idstring;
//private ArrayList<String> idlist = null;
@Override
public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	if (qName.equalsIgnoreCase("id")) {
		hasid=true;
		
	}
	
}
public void endElement(String uri, String localName, String qName) throws SAXException{
	if(hasid) {
		id.push(idstring);
//		System.out.println(idstring);
	}
	if (qName.equalsIgnoreCase("id")) {
		hasid=false;
		
	}
}
public void characters(char ch[], int start, int length) throws SAXException{
	 
		 idstring= new String(ch,start,length);

	 

}
public String getId() {
	
	return String.valueOf(id.pop());
}

}
