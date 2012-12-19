package annanda.estudo_prova.lab5;

public class Atrib implements Comando{
	private Var var;
	private Expressao expressao;
	
	public Atrib(Var var, Expressao expressao){
		this.var = var;
		this.expressao = expressao;
	}
	
	public void executa(){
		this.var.setValor(this.expressao.valor());
	}
}
