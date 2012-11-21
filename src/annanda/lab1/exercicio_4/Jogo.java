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
		
		this.carros[0] = new Carro();
		
		this.carros[0].xPosicao = 200;
		this.carros[0].yPosicao = ALTURA_DOS_CARROS + 30;
		this.carros[0].retanguloAltura = ALTURA_DOS_CARROS;
		this.carros[0].retanguloLargura = 100;
		this.carros[0].velocidade = 160;
		
		this.carros[1].xPosicao = 400;
		this.carros[1].yPosicao = ALTURA_DOS_CARROS + 30;
		this.carros[1].retanguloAltura = ALTURA_DOS_CARROS;
		this.carros[1].retanguloLargura = 100;
		this.carros[1].velocidade = 160;
		
		this.carros[2].xPosicao = 300;
		this.carros[2].yPosicao = ALTURA_DOS_CARROS + 30 + INTERVALO_ENTRE_CARROS + ALTURA_DOS_CARROS;
		this.carros[2].retanguloAltura = ALTURA_DOS_CARROS;
		this.carros[2].retanguloLargura = 150;
		this.carros[2].velocidade = 400;
		
//		this.carros[3].xPosicao = 300;
//		this.carros[3].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[3].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[3].retanguloLargura = 100;
//		this.carros[3].velocidade = 160;
//		
//		this.carros[4].xPosicao = 300;
//		this.carros[4].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[4].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[4].retanguloLargura = 100;
//		this.carros[4].velocidade = 160;
//		
//		this.carros[5].xPosicao = 300;
//		this.carros[5].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[5].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[5].retanguloLargura = 100;
//		this.carros[5].velocidade = 160;
//		
//		this.carros[6].xPosicao = 300;
//		this.carros[6].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[6].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[6].retanguloLargura = 100;
//		this.carros[6].velocidade = 160;
//		
//		this.carros[7].xPosicao = 300;
//		this.carros[7].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[7].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[7].retanguloLargura = 100;
//		this.carros[7].velocidade = 160;
//		
//		this.carros[8].xPosicao = 300;
//		this.carros[8].yPosicao = ALTURA_DOS_CARROS + 30;
//		this.carros[8].retanguloAltura = ALTURA_DOS_CARROS;
//		this.carros[8].retanguloLargura = 100;
//		this.carros[8].velocidade = 160;
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
