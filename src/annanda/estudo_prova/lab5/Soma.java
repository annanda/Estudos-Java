package annanda.estudo_prova.lab5;

public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direita;
	
	public Soma(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	public double valor(){
		return this.esquerda.valor() + this.direita.valor();
	}

}
