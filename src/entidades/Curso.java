package entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private List<Professor> professores = new ArrayList<Professor>();
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<String> turmas = new ArrayList<String>();
	private List<String> modulos = new ArrayList<String>();

	public Curso() {
	}

	public Curso(String nome, List<Professor> professores, List<Aluno> alunos, List<String> turmas,
			List<String> modulos) {
		this.nome = nome;
		this.professores = professores;
		this.alunos = alunos;
		this.turmas = turmas;
		this.modulos = modulos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<String> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<String> turmas) {
		this.turmas = turmas;
	}

	public List<String> getModulos() {
		return modulos;
	}

	public void setModulos(List<String> modulos) {
		this.modulos = modulos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", professores=" + professores + ", alunos=" + alunos + ", turmas=" + turmas
				+ ", modulos=" + modulos + "]";
	}

}
