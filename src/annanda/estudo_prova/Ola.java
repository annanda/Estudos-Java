package annanda.estudo_prova;

public class Ola {
	
	static final String NOME_UNIVERSO = "Diversão";
	
	 public static void main(String[] argv){ //qualquer método estático só pode chamar ou trabalhar com variáveis e métodos estáticos
		 System.out.println("Olá, universo: " + NOME_UNIVERSO);
		 Pessoa pessoa = new Pessoa("Bobona");
		 pessoa.setNome("Annanda");
		 System.out.println("Olá, " + pessoa.getNome());	 
	 }	
}