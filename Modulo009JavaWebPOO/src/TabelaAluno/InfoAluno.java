package TabelaAluno;

import ClasseAluno.Aluno;

public class InfoAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Vitor");
		aluno1.setRA("0021347");
		aluno1.setIdade(18);
		aluno1.setNota1(30.9);
		aluno1.setNota2(87);
		aluno1.setNota3(75);
		aluno1.setNota4(66.8);
		
		System.out.println("O aluno : "+aluno1.getNome());
		System.out.println("----------------------------------------");
		System.out.println("Idade : " +aluno1.getIdade());
		System.out.println("----------------------------------------");
		System.out.println("RA É :" +aluno1.getRA());
		System.out.println("----------------------------------------");
		System.out.println("Sua media final foi : " +aluno1.getMediaFinal());
		System.out.println("O resultado da sua media ela resulta em que você está : " + ( aluno1.getResultado() ? "APROVADO" : "REPROVADO"));
		
		
	}

}
