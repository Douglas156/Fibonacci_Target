package processoSeletivo;

public class Fibonacci {
	
	
	
	
	public String fibonacciIterativo(long n){
		
	    // Escolhi o tipo "long" porque a sequência pode se estender até valores enormes
	    long fibo1 = 0;
	    long fibo2 = 1;
	    
	    // Fazendo verificação para valores inválidos, que são os menores que zero
	    if (n < 0) {
	    	return "Valor inválido.";
	    }
	    
	    /* A soma dos valores será feita enquanto a soma da sequência for menor que o valor buscado(representado por "n"), 
	       quando deixar de ser menor que "n", ele será necessariamente igual ou maior que o mesmo e o valor será armazenado,
	       feito isso, basta verificar se é igual ou maior e retornar a resposta apropriada  */ 
	     
	    do {
	        long  temp = fibo1 + fibo2;
	        fibo1 = fibo2;
	        fibo2 = temp;
	    } while(fibo2 < n);
	    
	    // Caso de exceção para o valor 0, que não pôde ser integrado à lógica do loop
	    if (n == 0) {
	    	return "O valor inserido faz parte da sequência de Fibonacci";
	    }
	    else  if (fibo2 == n) {
	    	return "O valor inserido faz parte da sequência de Fibonacci";
	    }
	    else {
	    	return "O valor inserido NÃO faz parte da sequência de Fibonacci";
	    }
	    
	   
	}
	
	
	
	
	
	
	
	
}
