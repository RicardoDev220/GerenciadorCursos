package entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private String tefone;
	private Long matricula;
	private String curso;
	private String turma;
	private List<String> modulosConcluidos = new ArrayList<>();

	public Aluno() {
	}

	public Aluno(String nome, String tefone, Long matricula, String curso, String turma,
			List<String> modulosConcluidos) {
		this.nome = nome;
		this.tefone = tefone;
		this.matricula = matricula;
		this.curso = curso;
		this.turma = turma;
		this.modulosConcluidos = modulosConcluidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTefone() {
		return tefone;
	}

	public void setTefone(String tefone) {
		this.tefone = tefone;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public List<String> getModulosConcluidos() {
		return modulosConcluidos;
	}

	public void setModulosConcluidos(List<String> modulosConcluidos) {
		this.modulosConcluidos = modulosConcluidos;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", tefone=" + tefone + ", matricula=" + matricula + ", curso=" + curso
				+ ", turma=" + turma + ", modulosConcluidos=" + modulosConcluidos + "]";
	}

}
