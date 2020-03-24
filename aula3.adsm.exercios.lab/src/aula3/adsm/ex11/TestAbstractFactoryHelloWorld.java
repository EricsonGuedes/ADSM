package aula3.adsm.ex11;

public class TestAbstractFactoryHelloWorld {
	public static void main(String[] args) {
		AbstractHelloWorldFactory helloWorldFactory = HelloWorldFactoryProducer.getFactory();
		HelloWorld helloWorld = helloWorldFactory.getHelloWorldInstance("helloTela");
		String msg="";
		msg = helloWorld.helloworld();		
		System.out.println("=================================================================");
		
		/*helloWorldFactory = HelloWorldFactoryProducer.getFactory();
		helloWorld = helloWorldFactory.getHelloWorldInstance("helloTela");
		msg = helloWorld.helloworld();
		System.out.println(msg);*/
		
	
	}
	
	

}
