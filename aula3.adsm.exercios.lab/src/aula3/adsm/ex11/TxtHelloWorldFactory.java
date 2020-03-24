package aula3.adsm.ex11;

public class TxtHelloWorldFactory implements AbstractHelloWorldFactory {

	@Override
	public HelloWorld getHelloWorldInstance(String helloWorld) {
		switch(helloWorld) {
		case "helloTxt": return new HelloTxt();
		}
		return null;
	}

}
