package annanda.estudo_prova;

import annanda.estudo_prova.uteis.Pessoa;

public class Ola {
	
	static final String NOME_UNIVERSO = "Diversão";
	
	 public static void main(String[] argv){ //qualquer método estático só pode chamar ou trabalhar com variáveis e métodos estáticos
		 System.out.println("Olá, universo: " + NOME_UNIVERSO);
		 Pessoa pessoa = new Pessoa("Bobona");
		 pessoa.setNome("Annanda");
		 System.out.println("Olá, " + pessoa.getNome());
		 
		 Pessoa outraPessoa = new Pessoa("Felipe");
		 
		 if(pessoa.getNome().equals( outraPessoa.getNome())){
			 System.out.println("São clones!");
		 }
		 else {
			 System.out.println("Não não clones");	
		 }
		 pessoa.setCompanheiro(outraPessoa);
		 System.out.println(pessoa.getNome() + " é companheira de " + pessoa.getCompanheiro().getNome());
		 
		 Pessoa maisOutraPessoa = new Pessoa("Ivna");
		 Pessoa[] amigos = new Pessoa[1];
		 amigos[0] = maisOutraPessoa;
		 pessoa.setAmigos(amigos);
		 
		 pessoa.imprimeAmigos();		 
		 outraPessoa.imprimeAmigos();
	 }	
}