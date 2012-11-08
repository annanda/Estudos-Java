package annanda.lab1.exercicio_4;

public class Carro {
	public int retanguloAltura;
	public int retanguloLargura;
	public double velocidade;
	public int direcao; // 1 representa esquerda; 0 representa direita
	public int xPosicao;
	public int yPosicao;
	
	public final int ESQUERDA=1; //usando 'final' esse atributo não pode mais ser modificado
	public final int DIREITA=0; //usando 'final' esse atributo não pode mais ser modificado
	
	public Carro(int retanguloAltura, int retanguloLargura, double velocidade, int direcao, int xPosicao, int yPosicao){
		this.retanguloAltura = retanguloAltura;
		this.retanguloLargura = retanguloLargura;
		this.velocidade = velocidade;
		this.direcao = direcao;
		this.xPosicao = xPosicao;
		this.yPosicao = yPosicao;		
	}
	
	public void mover(double dt){

		//a principio considera que está indo para a direita
		int modificadorDirecao = 1;
		
		//se estiver indo para a esquerda, então a nova posição deve ser reduzida da original
		if(this.direcao == ESQUERDA){
			modificadorDirecao *= -1;
		}

		//incrementa a posição x com a nova quantidade de 'passos'.
		//aplica o modificador para tornar o valor negativo, ou manter positivo,
		//se for para esquerda ou para direita, respectivamente
		this.xPosicao += modificadorDirecao * (int)(this.velocidade * dt);
		
		if(this.xPosicao > 800){
			this.xPosicao -=  800;
		}
		if(this.xPosicao < 0){
			this.xPosicao += 800;			
		}
	}	
}
