package annanda.estudo_prova.lab5;

public class If implements Comando{
	private Expressao expressaoTeste;
	private Comando comandoThen;
	private Comando comandoElse;
	
	public If(Expressao expressaoTeste, Comando comandoThen, Comando comandoElse){
		this.expressaoTeste = expressaoTeste;
		this.comandoThen = comandoThen;
		this.comandoElse = comandoElse;
	}
	
	public void executa(){
		if(expressaoTeste.valor() == 1){
			comandoThen.executa();
		}
		else {
			comandoElse.executa();
		}
	}
}
