package annanda.estudo_prova.lab5;

public class Teste {

	public static void main(String[] args) {
//		Num a = new Num(4);
//		Num b = new Num(9);
//		
//		Soma c = new Soma(a, b);
//		System.out.println("Soma: " + c.valor());
//		
//		Soma d = new Soma(c, a);
//		System.out.println("Soma 2: " + d.valor());
//		
//		Soma f = new Soma(new Num(3), d);
//		System.out.println("Soma 3: " + f.valor());
		
		Var x = new Var("x");
	    Var fat = new Var("fat");
	    Comando prog = 
	      new Bloco(new Comando[] {
	                  new Atrib(x, new LeNumero()),
	                  new If(new Menor(new Num(0), x),
	                         new Bloco(new Comando[] { new Atrib(fat, new Num(1)),
	                                                   new While(new Menor(new Num(0), x),
	                                                             new Bloco(new Comando[] { new Atrib(fat, new Mul(fat, x)),     
	                                                                                       new Atrib(x, new Sub(x, new Num(1))) })),
	                                                   new Imprime(fat) }),
	                         new Bloco(new Comando[] { })) });
	    prog.executa();

	}

}
