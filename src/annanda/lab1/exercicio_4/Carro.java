package annanda.lab1.exercicio_4;

public class Carro {
	public int retanguloAltura;
	public int retanguloLargura;
	public double velocidade;
	public int direcao; // 1 representa esquerda; 0 representa direita
	public double xPosicao;
	public double yPosicao;
	public Cor cor;
	
	public Carro(int retanguloAltura, int retanguloLargura, double velocidade, int direcao, double xPosicao, double yPosicao, Cor cor){
		this.retanguloAltura = retanguloAltura;
		this.retanguloLargura = retanguloLargura;
		this.velocidade = velocidade;
		this.direcao = direcao;
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;
		this.cor = cor;
	}
	
	public Carro(){
		
	}
	
	public void desenhar(Tela tela) {
		tela.retangulo(this.xPosicao, this.yPosicao, this.retanguloLargura, this.retanguloAltura, this.cor);
	}
	
	public void mover(double dt){
		if(this.direcao == 0){
			this.xPosicao = this.xPosicao + (this.velocidade * dt);
			if(this.xPosicao > 800){

				this.xPosicao -=  800 + this.retanguloLargura;

			}
		}
		if(this.direcao == 1){
			this.xPosicao = this.xPosicao - (this.velocidade * dt);
			if(this.xPosicao < 0 - this.retanguloLargura ){
				this.xPosicao += 800 + this.retanguloLargura;			
			}
		}		
	}	
}
