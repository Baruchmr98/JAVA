package Bucles;

public class ContinueLoop {

	public static void main(String[] args) {
		
		int cliente = 1;
		
		for(; cliente <= 10; cliente++) {
			if(cliente == 5) {
				System.out.println("    ¡¡¡¡GANADOR!!!!    ");
				continue;
			} //if
			System.out.println("Eres el cliente número " + cliente);
		}//for
	}
}
