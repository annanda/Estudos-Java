package annanda.estudo_prova.lab5;

public class LeNumero implements Expressao{
	
    // Variável global para a entrada padrão
    static java.util.Scanner STDIN = new java.util.Scanner(System.in);

    // Função para ler um double da entrada padrão
    static double readDouble() {
      return STDIN.nextDouble();
    }
    
	public LeNumero(){
		
	}
	
	public double valor(){
		return readDouble();
	}

}
