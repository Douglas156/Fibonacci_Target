package processoSeletivoString;

public class VerificarString {

	/* OBS: Não vi necessidade de fazer atributos, construtores nem os getters e setters para a tarefa, muito menos o ToString já que as saídas 
	   já possuem até parâmetros especificados */
	
	
	public int checarA(String frase) {
		int contador = 0;
		char letra;
		/* Enquanto o valor i não chega no valor do tamanho da frase, a variável "letra" continua pegando cada caracter na frase e analisando
		na estrutura condicional "if" se a letra corresponde ao que está sendo buscado, e nos casos afirmativos, o contador é incrementado em 1
		para fazer a contagem */
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			//A lógica para letras de cases distintos também poderia ser feito convertendo tudo para upper ou lower case, mas achei deselegante
			if (letra == 'a' || letra == 'A') {
				contador++;
			}
		}
		return contador;
	}
	
}
