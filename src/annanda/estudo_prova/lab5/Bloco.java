package annanda.estudo_prova.lab5;

public class Bloco implements Comando {
	private Comando[] comandos;
	
	public Bloco(Comando ... comandos){
		this.comandos = comandos;
	}
	
	public void executa(){
		for(Comando comando: this.comandos){
			comando.executa();
		}
	}
}
