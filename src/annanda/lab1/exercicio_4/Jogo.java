package annanda.lab1.exercicio_4;
import java.util.HashSet;

public class Jogo {
	private Carro[] carros;
	private Sapo sapo;
	
	public static int LARGURA = 800;
	public static int ALTURA = 600;
	public static String TITULO = "Frogger";
	
	public static int INTERVALO_ENTRE_CARROS = 25;
	public static int ALTURA_DOS_CARROS = 75;
	public static int TAMANHO_RUA = 3 * INTERVALO_ENTRE_CARROS + 4 * ALTURA_DOS_CARROS;
	
	
	public Jogo() {	
		this.carros = new Carro[9];
		this.carros[0] = new Carro();
		
		this.carros[0].xPosicao = 200;
		this.carros[0].yPosicao = ALTURA_DOS_CARROS + 30;
		this.carros[0].retanguloAltura = ALTURA_DOS_CARROS;
		this.carros[0].retanguloLargura = 100;
		this.carros[0].velocidade = 160;
	}
	
	public void desenhar(Tela tela) {
		Cor corBranca = new Cor("branco");
		tela.retangulo(0, 30, 800, 75, corBranca);
		tela.retangulo(0, INTERVALO_ENTRE_CARROS + 75 + TAMANHO_RUA, 800, 75, corBranca);
		
		this.carros[0].desenhar(tela);
	}
	
	public void tique(HashSet<String> teclas, double dt) {
		this.carros[0].mover(dt);
	}
	
	public void tecla(String tecla) {
	}
	
	public static void main(String[] args) {
		Motor motor = new Motor(new Jogo());
	}
}
