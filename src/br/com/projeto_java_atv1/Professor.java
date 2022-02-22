package br.com.projeto_java_atv1;

public class Professor {

	private String nome;
	
	private int numInscricao;
	
	private Materia materia;
	
	
//---------------GET SET-----------------	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumInscricao() {
		return numInscricao;
	}

	public void setNumInscricao(int numInscricao) {
		this.numInscricao = numInscricao;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
//---------------GET SET-----------------	
	

	public void Printar() {
		System.out.println();
	}
	
	
	public Professor() {
		this.materia = new Materia();
}
}
