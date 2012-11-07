package annanda.lab1.exercicio_4;

public class Carro {
	public int retanguloAltura;
	public int retanguloLargura;
	public double velocidade;
	public int direcao; // 1 representa esquerda; 0 representa direita
	public int xPosicao;
	public int yPosicao;
	
	public Carro(int retanguloAltura, int retanguloLargura, double velocidade, int direcao, int xPosicao, int yPosicao){
		this.retanguloAltura = retanguloAltura;
		this.retanguloLargura = retanguloLargura;
		this.velocidade = velocidade;
		this.direcao = direcao;
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;		
	}
	
	public void mover(double dt){
		if(this.direcao == 0){
			this.xPosicao = this.xPosicao + (int)(this.velocidade * dt);
		}
		if(this.direcao == 1){
			this.yPosicao = this.xPosicao - (int)(this.velocidade * dt);
		}
		
		if(this.xPosicao > 800){
			this.xPosicao -=  800;
		}
		if(this.xPosicao < 0){
			this.xPosicao += 800;			
		}
	}	
}
