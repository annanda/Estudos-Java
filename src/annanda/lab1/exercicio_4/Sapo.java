package annanda.lab1.exercicio_4;

public class Sapo {
	public double raio;
	public int vidas;
	public double xPosicao;
	public double yPosicao;
	public double xFinal;
	public double yFinal;
	public String direcao;
	public static double PULO_SAPO = 100;
	public static double VELOCIDADE_SAPO = 300;
	
	public Sapo(double raio, int vidas, double xPosicao, double yPosicao, String direcao){
		this.raio = raio;
		this.vidas = vidas;
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;		
		this.direcao = direcao;
		this.xFinal = xPosicao;
		this.yFinal = yPosicao;
	}
	
	public Sapo(){
		
	}
	
	public void desenhar(Tela tela) {
		Cor cor = new Cor("verde");
		tela.circulo(this.xPosicao, this.yPosicao, 30, cor);
	}
	
	
	
	public void preparaMover(String direcao){
		if(direcao.equals("up")){
			this.yFinal = yPosicao - PULO_SAPO;
		}
		if(direcao.equals("down")){
			this.yFinal = yPosicao + PULO_SAPO;
		}
		if(direcao.equals("left")){
			this.xFinal = xPosicao - PULO_SAPO;
		}
		if(direcao.equals("right")){
			this.xFinal = xPosicao + PULO_SAPO;
		}
		this.direcao = direcao;
		System.out.println("Estou me movendo: (" + this.xPosicao + " | " + this.yPosicao + ") -> (" + this.xFinal + " | " + this.yFinal + ") - direcao: " + this.direcao);
	}
	
	public void mover(double dt){
		if((int)this.yPosicao == (int)this.yFinal && (int)this.xPosicao == (int)this.xFinal) {
			this.yPosicao = this.yFinal;
			this.xPosicao = this.xFinal;
			return;
		}
		if(this.direcao.equals("up")){
			this.yPosicao = this.yPosicao - (VELOCIDADE_SAPO * dt);
		}
		if(this.direcao.equals("down")){
			this.yPosicao = this.yPosicao + (VELOCIDADE_SAPO * dt);
		}
		if(this.direcao.equals("left")){
			this.xPosicao = this.xPosicao - (VELOCIDADE_SAPO * dt);
		}
		if(this.direcao.equals("right")){
			this.xPosicao = this.xPosicao + (VELOCIDADE_SAPO * dt);
			if(this.xPosicao > Jogo.LARGURA){
				System.out.println("Sou maior que 800: " + this.xPosicao);
				this.xFinal = 0 + (int)(this.xFinal - this.xPosicao);
				this.xPosicao -=  Jogo.LARGURA + (this.raio);
			}
		}
		
	}
	
}
