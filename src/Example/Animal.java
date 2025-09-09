package Example;

public interface Animal {
	   void sound();
	   void sleep();
}

public class Dog implements Animal {
	    public void sound() {
	        System.out.println("Dog barks");
	    }

	   
	    public void sleep() {
	        System.out.println("Dog is sleeping");
	    }
}

	
public class Main {
	  public static void main(String[] args) {
	        Animal myDog = new Dog();
	        myDog.sound();
	        myDog.sleep();
	  }
}

