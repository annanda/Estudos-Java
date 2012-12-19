package annanda.estudo_prova.lab5;

public class Var implements Expressao {
	private String nome;
	private double valor;
	
	public Var(String nome){
		this.nome = nome;
		this.valor = 0;
	}
	public double valor(){
		return this.valor;
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
}
