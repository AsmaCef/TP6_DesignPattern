
public class Facade {
	   private Subsystem1 s1;
	   private Subsystem2 s2;

	   public Facade() {
	      s1 = new Subsystem1();
	      s2 = new Subsystem2();
	   }
	   public void operation(){
	      s1.operation1();
	      s1.operation2();
	      s2.operation1();
	      s2.operation2();
	   }
}
