package annanda.lab1;

public class Imovel {
	public double metragem;
	public int numero_vagas;
	public Endereco endereco;
	public Proprietario proprietario;
	
	public Imovel(double metragem, int numero_vagas, Endereco endereco, Proprietario proprietario){
		this.metragem = metragem;
		this.numero_vagas = numero_vagas;
		this.endereco = endereco;
		this. proprietario = proprietario;
	}

}
