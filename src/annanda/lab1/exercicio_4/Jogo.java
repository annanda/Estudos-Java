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
		
		for(int i = 0; i < carros.length; i++){
			carros[i] = new Carro();
		}
		
		for(int i = 0; i < 2; i++){	
			
			this.carros[i].xPosicao = 200 * (i+1);
			this.carros[i].yPosicao = ALTURA_DOS_CARROS + 30;
			this.carros[i].retanguloAltura = ALTURA_DOS_CARROS;
			this.carros[i].retanguloLargura = 100;
			this.carros[i].velocidade = 160;
		}

		this.carros[2].xPosicao = 300;
		this.carros[2].yPosicao = ALTURA_DOS_CARROS + 30 + INTERVALO_ENTRE_CARROS + ALTURA_DOS_CARROS;
		this.carros[2].retanguloAltura = ALTURA_DOS_CARROS;
		this.carros[2].retanguloLargura = 150;
		this.carros[2].velocidade = 400;
		
		for(int i = 3; i < 6; i++){
			this.carros[i].xPosicao = 200 * (i-1);
			this.carros[i].yPosicao = ALTURA_DOS_CARROS + 30 + ((INTERVALO_ENTRE_CARROS + ALTURA_DOS_CARROS) * 2) ;
			this.carros[i].retanguloAltura = ALTURA_DOS_CARROS;
			this.carros[i].retanguloLargura = 60;
			this.carros[i].velocidade = 100;
		}
		
		for(int i = 6; i < 9; i++){
			this.carros[i].xPosicao = 200 * (i-1);
			this.carros[i].yPosicao = ALTURA_DOS_CARROS + 30 + ((INTERVALO_ENTRE_CARROS + ALTURA_DOS_CARROS) * 3) ;
			this.carros[i].retanguloAltura = ALTURA_DOS_CARROS;
			this.carros[i].retanguloLargura = 60;
			this.carros[i].velocidade = 134;			
		}

	}
	
	public void desenhar(Tela tela) {
		Cor corBranca = new Cor("branco");
		tela.retangulo(0, 30, 800, 75, corBranca);
		tela.retangulo(0, INTERVALO_ENTRE_CARROS + 75 + TAMANHO_RUA, 800, 75, corBranca);
		
		for(Carro carro : this.carros){
			carro.desenhar(tela);
		}
		
	}
	
	public void tique(HashSet<String> teclas, double dt) {
		for(Carro carro : this.carros){
			carro.mover(dt);
		}
	}
	
	public void tecla(String tecla) {
	}
	
	public static void main(String[] args) {
		Motor motor = new Motor(new Jogo());
	}
}
