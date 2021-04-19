package aula07042021;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("Inicio do Método main");
		primeiroMetodo();
		System.out.println("Fim do Método main");
	}
	
	
	public static void primeiroMetodo() {
		System.out.println("Início do Método primeiroMetodo");
		segundoMetodo();
		System.out.println("Fim do Método primeiroMetodo");
	}
	
	
	public static void segundoMetodo() {
		System.out.println("Início do Método segundoMétodo");
		for(int i=0;i<=5;i++) {
			System.out.println("Número: " + i);
			//System.out.println(10/0);	
		}
		System.out.println("Fim do Método segundoMétodo");
	try {
		System.out.println(10/0);
		throw new MinhaExcecao("lancei minha excecao");
	}catch(Throwable e) {
		System.err.println("a sua excecao foi capiturada");
	}
	}

}