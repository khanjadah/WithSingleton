package singleton;

/* In oop, a Singleton class is a class that can have only one object(instance of the class) at a time.
 * How to design Singleton class;
 * 1).Make a constructor as private.
 * 2).Write a public static method (getInstance) that has return type of object of this singleton class(Lazy initialization)
 */

public class Singleton {
	
	
	private static Singleton singleton_instance;
	public String str;
	
	
	private Singleton() {
		
		str = "Hey I am using singleton class pattern";
		
	}
	
	public static Singleton getSingleton_instance() {
		
		if(singleton_instance == null) 
			
			singleton_instance = new Singleton();
		
		return singleton_instance;
	}

	public static void main(String[] args) {
		
		Singleton x = Singleton.getSingleton_instance();
		Singleton y = Singleton.getSingleton_instance();
		Singleton z = Singleton.getSingleton_instance();

		
		x.str =(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}


	

}
