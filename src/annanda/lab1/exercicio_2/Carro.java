
public class Carro {
	
	public String modelo;
	public double preco; 
	public double consumo_medio;
	public boolean novo; 
	public Dono dono;
	
	public Carro(String modelo, double preco, double consumo_medio, boolean novo, Dono dono){
		this.modelo = modelo;
		this.preco = preco;
		this.consumo_medio = consumo_medio;
		this.novo = novo;
		this.dono = dono;
	}

}
