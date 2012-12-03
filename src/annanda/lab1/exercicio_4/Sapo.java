package annanda.lab1.exercicio_4;

public class Sapo {
	public double raio;
	public int vidas;
	public double xPosicao;
	public double yPosicao;
	
	public Sapo(double raio, int vidas, double xPosicao, double yPosicao){
		this.raio = raio;
		this.vidas = vidas;
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;		
	}
	
	public Sapo(){
		
	}
	
	public void desenhar(Tela tela) {
		Cor cor = new Cor("verde");
		tela.circulo(this.xPosicao, this.yPosicao, 30, cor);
	}
	
	
	
	public void preparaMover(String direcao){
		System.out.println("Estou me movendo para " + direcao);
		
	}
	
}
