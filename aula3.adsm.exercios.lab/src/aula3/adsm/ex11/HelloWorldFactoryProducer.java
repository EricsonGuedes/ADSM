package aula3.adsm.ex11;

public class HelloWorldFactoryProducer {
	private HelloWorldFactoryProducer() {
		throw new AssertionError();
		
	}
	
	public static AbstractHelloWorldFactory  getFactory() {
		int sorteado = 0;
		String resultado = "";
		
		sorteado = (int)Math.random() * 1;
		
		switch(sorteado) {
		
		case 0: {resultado = "TelaHelloWorldFactory"; return new TelaHelloWorldFactory();
		}
		
		case 1: {resultado = "TxtHelloWorldFactory"; return new TxtHelloWorldFactory();}
		} System.out.println(resultado);
		return null;
	}

}
