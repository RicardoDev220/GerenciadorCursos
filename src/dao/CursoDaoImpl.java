package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entidades.Curso;

public class CursoDaoImpl implements CursoDao {
	private static List<Curso> cursos = new ArrayList<Curso>();

	@Override
	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}

	@Override
	public List<Curso> listarCursos() {
		return cursos;
	}

	@Override
	public Curso pesquisarCursoPorCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> pesquisarCursoPorNome(String nomeCurso) {
		List<Curso> resultadoPesquisa = new ArrayList<Curso>();
		Iterator<Curso> it = cursos.iterator();
		
		while (it.hasNext()) {
			Curso curso = it.next();
			
			if(curso.getNome() == nomeCurso) {
				resultadoPesquisa.add(curso);
			}
		}
		
		return resultadoPesquisa;
	}

	@Override
	public void atualizarCurso(Curso curso) {
		int indice = cursos.indexOf(curso);
		cursos.set(indice, curso);
	}

	@Override
	public void removerCursoPorCodigo(Long codigo) {
		Iterator<Curso> it = cursos.iterator();
		
		while (it.hasNext()) {
			Curso curso = it.next();
			
			if(curso.getCodigo() == codigo) {
				it.remove();
			}
		}
	}

}
