package aula07042021;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("Inicio do M�todo main");
		primeiroMetodo();
		System.out.println("Fim do M�todo main");
	}
	
	
	public static void primeiroMetodo() {
		System.out.println("In�cio do M�todo primeiroMetodo");
		segundoMetodo();
		System.out.println("Fim do M�todo primeiroMetodo");
	}
	
	
	public static void segundoMetodo() {
		System.out.println("In�cio do M�todo segundoM�todo");
		for(int i=0;i<=5;i++) {
			System.out.println("N�mero: " + i);
			//System.out.println(10/0);	
		}
		System.out.println("Fim do M�todo segundoM�todo");
	try {
		System.out.println(10/0);
		throw new MinhaExcecao("lancei minha excecao");
	}catch(Throwable e) {
		System.err.println("a sua excecao foi capiturada");
	}
	}

}