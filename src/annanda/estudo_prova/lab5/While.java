package annanda.estudo_prova.lab5;

public class While implements Comando{
	private Comando corpoLaco;
	private Expressao condicaoLaco;
	
	public While(Expressao condicaoLaco, Comando corpoLaco){
		this.corpoLaco = corpoLaco;
		this.condicaoLaco = condicaoLaco;
	}
	
	public void executa(){
		while(this.condicaoLaco.valor() == 1){
			this.corpoLaco.executa();
		}
	}
}
