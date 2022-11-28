package entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String nome;
	private String telefone;
	private String curso;
	private List<String> turmas = new ArrayList<String>();

	public Professor() {
	}

	public Professor(String nome, String telefone, String curso, List<String> turmas) {
		this.nome = nome;
		this.telefone = telefone;
		this.curso = curso;
		this.turmas = turmas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<String> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<String> turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", telefone=" + telefone + ", curso=" + curso + ", turmas=" + turmas + "]";
	}

	
}
