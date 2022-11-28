package dao;

import java.util.List;

import entidades.Curso;

public interface CursoDao {
	public void cadastrarCurso(Curso curso);
	
	public List<Curso> listarCursos();
	
	public Curso pesquisarCursoPorNome(String nomeCurso);
	
	public void atualizarCurso(Curso curso);
	
	public void removerCursoPorNome(String nomeCurso);
}
