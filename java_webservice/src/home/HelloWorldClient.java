package home;

public class HelloWorldClient {

	public static void main(String...args) {
		IHelloWorldService service = new IHelloWorldService();
		HelloWorld helloworld = service.getHelloWorldPort();
		System.out.println(helloworld.getMessage());
	}
}
