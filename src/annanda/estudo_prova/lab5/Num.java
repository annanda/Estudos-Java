package annanda.estudo_prova.lab5;

public class Num implements Expressao {
	private double numeral;
	
	public Num(double numeral){
		this.numeral = numeral;
	}
	
	public double valor(){
		return this.numeral;
	}
}
