package lambdas;

public class Main {

	public static void main(String[] args) {
	
		Dialoguer d = (s) -> System.out.println("tu as dit : "+ s);
		d.parler("Bonjour tout le monde ");

	}

}
