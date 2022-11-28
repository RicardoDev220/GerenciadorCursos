package dao;

import java.util.List;

import entidades.Aluno;

public interface AlunoDao {
	public void cadastrarAluno(Aluno aluno);

	public Aluno pesquisarAlunoPorMatricula(Long matricula);

	public List<Aluno> listarAlunos();

	public void atualizarAluno(Aluno aluno);

	public void removerAluno(Long matricula);

}
