package devandroid.johnston.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.johnston.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller iniciada");
        //Log.d - 'd' de debug

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.i("MVC_Controller", "Salvo: "+pessoa.toString());
    }
}
