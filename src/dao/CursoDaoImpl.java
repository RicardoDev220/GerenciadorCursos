package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entidades.Curso;

public class CursoDaoImpl implements CursoDao {
	List<Curso> cursos = new ArrayList<Curso>();

	@Override
	public void cadastrarCurso(Curso curso) {
		cursos.add(curso);
	}

	@Override
	public List<Curso> listarCursos() {
		return cursos;
	}

	@Override
	public Curso pesquisarCursoPorNome(String nomeCurso) {
		Iterator<Curso> it = cursos.iterator();
		
		while (it.hasNext()) {
			Curso curso = it.next();
			
			if(curso.getNome() == nomeCurso) {
				return curso;
			}
		}
		
		return null;
	}

	@Override
	public void atualizarCurso(Curso curso) {
		int indice = cursos.indexOf(curso);
		cursos.set(indice, curso);
	}

	@Override
	public void removerCursoPorNome(String nomeCurso) {
		Iterator<Curso> it = cursos.iterator();
		
		while (it.hasNext()) {
			Curso curso = it.next();
			
			if(curso.getNome() == nomeCurso) {
				it.remove();
			}
		}
	}

}
