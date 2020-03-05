
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Singleton monSingleton1 = Singleton.getInstance();
		 Singleton monSingleton2 = Singleton.getInstance();

	      System.out.println(monSingleton1+"\n"+monSingleton2);
	}

}
