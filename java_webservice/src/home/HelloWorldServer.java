
package home;
import javax.xml.ws.Endpoint;


public class HelloWorldServer {
	
	public static void main(String[] args) {
		String bindingURI = "http://localhost:9898/helloWorldService";
		home.HelloWorld webService = new home.IHelloWorld();
        Endpoint.publish(bindingURI, webService);
        System.out.println("Server started at: " + bindingURI);
	}	
}