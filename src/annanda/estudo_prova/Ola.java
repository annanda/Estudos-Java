package annanda.estudo_prova;

import annanda.estudo_prova.uteis.Pessoa;
import annanda.estudo_prova.uteis.Homem;

public class Ola {
	
	static final String NOME_UNIVERSO = "Diversão";
	
	 public static void main(String[] argv){ //qualquer método estático só pode chamar ou trabalhar com variáveis e métodos estáticos
		 System.out.println("Olá, universo: " + NOME_UNIVERSO);
		 Pessoa annanda = new Pessoa("Gatona", "feminino");
		 annanda.setNome("Annanda");
		 System.out.println("Olá, " + annanda.getNome() + ", " + annanda.getSexo());
		 
		 Homem felipe = new Homem("Felipe");
		 
		 if(annanda.getNome().equals( felipe.getNome())){
			 System.out.println("São clones!");
		 }
		 else {
			 System.out.println("Não não clones");	
		 }
		 annanda.setCompanheiro(felipe);
		 System.out.println(annanda.getNome() + " é companheira de " + annanda.getCompanheiro().getNome());
		 
		 Pessoa maisOutraPessoa = new Pessoa("Ivna");
		 Pessoa[] amigos = new Pessoa[1];
		 amigos[0] = maisOutraPessoa;
		 annanda.setAmigos(amigos);
		 
		 annanda.imprimeAmigos();		 
		 felipe.imprimeAmigos();
		
		 
		 
	 }	
}