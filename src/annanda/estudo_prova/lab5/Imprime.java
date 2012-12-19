package annanda.estudo_prova.lab5;

public class Imprime implements Comando {
	private Expressao expressao;
	
	public Imprime(Expressao expressao){
		this.expressao = expressao;
	}
	public void executa(){
		System.out.println(this.expressao.valor());
	}
}
