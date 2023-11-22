package devandroid.johnston.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.johnston.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;

    public List getListaDeCursos() { //Método para devolver uma lista

        listCursos = new ArrayList<Curso>();

        //Lista de cursos
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());

        return listCursos;
    }
}
