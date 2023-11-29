package devandroid.johnston.appgaseta.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.johnston.appgaseta.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaDeCursos() { //Método para devolver uma lista

        listCursos = new ArrayList<Curso>();

        //Lista de cursos
        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Python"));
        listCursos.add(new Curso("PHP"));
        listCursos.add(new Curso("Java EE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));

        return listCursos;
    }

    public ArrayList<String> dadosParaSpinner() { //MÉTODO

        ArrayList<String> dados = new ArrayList<>();

            for (int i = 0; i < getListaDeCursos().size(); i++) {

                Curso objeto = (Curso) getListaDeCursos().get(i);
                objeto.getNomeDoCursoDesejado();
                dados.add(objeto.getNomeDoCursoDesejado());

            }

                return dados;
    }
}
