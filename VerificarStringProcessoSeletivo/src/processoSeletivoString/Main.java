package processoSeletivoString;
import java.util.Scanner;
import processoSeletivoString.VerificarString;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase para ser escaneada: ");
		String frase = scanner.nextLine();
		
		scanner.close();
		
		VerificarString verificarObj = new VerificarString();
		
		System.out.println(verificarObj.checarA(frase));

	}

}
