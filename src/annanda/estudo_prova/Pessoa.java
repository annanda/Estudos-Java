package annanda.estudo_prova;

public class Pessoa{
	private String nome;
	
	//se chama sobrecarga de método
	public Pessoa(){
		this.nome = "Joao Ninguem";
	}
	public Pessoa(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		System.out.println("Antes: " + this.nome);		
		this.nome = nome;		
		System.out.println("Depois: " + this.nome);
	}
}