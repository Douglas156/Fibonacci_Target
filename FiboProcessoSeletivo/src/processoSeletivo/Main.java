package processoSeletivo;
import processoSeletivo.Fibonacci;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor para buscar: ");
		long entrada = scanner.nextLong();
		
		Fibonacci fibonac = new Fibonacci();
		
		scanner.close();
		
		System.out.println(fibonac.fibonacciIterativo(entrada));

	}

}

//0 1 1 2 3 5