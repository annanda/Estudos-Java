package annanda.lab1;

public class Dono {
	public String nome;
	public int idade;
	
	public Dono(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public boolean igual(Dono outro){
		if(this.nome.equals(outro.nome)){
			if(this.idade == outro.idade){
				return true;
			}
		}
		return false;
	}

}
