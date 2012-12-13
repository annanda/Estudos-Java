package annanda.lab1.exercicio_4;

/**
 * Cores em RGB
 */
public class Cor
{
    public int r;
    public int g;
    public int b;
    
    /*
     * Cria uma cor dados os componentes
     */
    public Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    /*
     * Cria uma cor dado seu nome
     */
    public Cor(String cor) {
        if(cor.equals("branco")) {
            this.r = 255;
            this.g = 255;
            this.b = 255;
        } else if(cor.equals("azul")) {
            this.b = 255;
        } else if(cor.equals("vermelho")) {
            this.r = 255;
        } else if(cor.equals("verde")) {
            this.g = 255;
        }
    }
}
