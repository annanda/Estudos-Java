package annanda.lab1.exercicio_4;
import java.util.HashSet;

public class Jogo {
	private Carro[] carros;
	private Sapo sapo;
	
	public static int LARGURA = 800;
	public static int ALTURA = 600;
	public static String TITULO = "Frogger";
	
	public Jogo() {		
	}
	
	public void desenhar(Tela tela) {
	}
	
	public void tique(HashSet<String> teclas, double dt) {
	}
	
	public void tecla(String tecla) {
	}
	
	public static void main(String[] args) {
		Motor motor = new Motor(new Jogo());
	}
}
