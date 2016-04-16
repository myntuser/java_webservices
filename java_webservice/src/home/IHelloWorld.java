package home;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.jws.WebMethod;
import javax.jws.WebResult;

@WebService(name = "HelloWorld", targetNamespace = "http://home/")
@XmlSeeAlso({
    ObjectFactory.class
})
public class IHelloWorld implements HelloWorld {

	@Override
	@WebMethod
	@WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessage", targetNamespace = "http://home/", className = "home.GetMessage")
    @ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://home/", className = "home.GetMessageResponse")
    @Action(input = "http://home/HelloWorld/getMessageRequest", output = "http://home/HelloWorld/getMessageResponse")
	public String getMessage() {
		// TODO Auto-generated method stub
		return "hello, world";
	}

}
