package pkg1;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;

public class TC1 
{
	public static void main(String[] args) throws XmlException, IOException, SoapUIException 
	{
	WsdlProject ws=new WsdlProject("Documents:\\my_project.xml");
	TestSuite ts=ws.getTestSuiteByName("Library Management");
	for(int i=0;i<ts.getTestCaseCount();i++)
	{
	TestCase tc=ts.getTestCaseAt(i);
    TestRunner tr=tc.run(new PropertiesMap(),false);
    
	}	
		
	}
	
	

}
