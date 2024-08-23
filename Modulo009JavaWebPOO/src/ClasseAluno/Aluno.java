package ClasseAluno;

public class Aluno {
	String Nome;
	String RA;
	int idade;
	double Nota1;
	double Nota2;
	double Nota3;
	double Nota4;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota1() {
		return Nota1;
	}

	public void setNota1(double nota1) {
		Nota1 = nota1;
	}

	public double getNota2() {
		return Nota2;
	}

	public void setNota2(double nota2) {
		Nota2 = nota2;
	}

	public double getNota3() {
		return Nota3;
	}

	public void setNota3(double nota3) {
		Nota3 = nota3;
	}

	public double getNota4() {
		return Nota4;
	}

	public void setNota4(double nota4) {
		Nota4 = nota4;
	}

	public double getMediaFinal() {
		return (Nota1 + Nota2 + Nota3 + Nota4) / 4;
	}
}
