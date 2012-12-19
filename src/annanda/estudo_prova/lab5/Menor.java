package annanda.estudo_prova.lab5;

public class Menor implements Expressao{
	private Expressao esquerda;
	private Expressao direita;
	
	public Menor(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public double valor(){
		if(this.esquerda.valor() < this.direita.valor()){
			return 1;
		}
		else{
			return 0;
		}
	}
}
