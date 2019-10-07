package org.hl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Check1 {
	public static void main(String[] args) throws JAXBException {
		JAXBContext con=JAXBContext.newInstance(Class.class);
		Unmarshaller un=con.createUnmarshaller();
		File xmlloc=new File("C:\\Users\\Greens-12\\Desktop\\aarthi\\XmlCheck\\src\\org\\hl\\try.xml");
		Class c=(Class)un.unmarshal(xmlloc);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhn());
	}

}
