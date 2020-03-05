package tp6;

public class Main {
	public static void main(String[] args) {

		Context context = new Context(new ConcreteStrategyA());	
		context.executeStrategy();
	}}
