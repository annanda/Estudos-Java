package annanda.estudo_prova.uteis;

public class Pessoa{
	private String nome;
	private Pessoa companheiro;
	private Pessoa[] amigos;
	
	
	public Pessoa(){
		this.nome = "Joao Ninguem";
		this.amigos = new Pessoa[10];
	}
	//se chama sobrecarga de método
	public Pessoa(String nome){
		this(); //para chamar o construtor padrao
		this.nome = nome;
	}	
	
	//=============== GETs e SETs ===================================
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		System.out.println("Antes: " + this.nome);		
		this.nome = nome;		
		System.out.println("Depois: " + this.nome);
	}
	
	public Pessoa getCompanheiro(){
		return this.companheiro;		
	}
	
	public void setCompanheiro(Pessoa companheiro){
		this.companheiro = companheiro;
	}
	
	public Pessoa[] getAmigos(){
		return this.amigos;
	}
	
	public void setAmigos(Pessoa[] amigos){
		this.amigos = amigos;
	}
	
	public void imprimeAmigos(){
		for(Pessoa amigo: this.amigos){
			if(amigo != null){
				System.out.println("Amigo: " + amigo.getNome());
			}			
		}
	}	
}