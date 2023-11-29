package devandroid.johnston.appgaseta.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.johnston.appgaseta.model.Pessoa;
import devandroid.johnston.appgaseta.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();//cria a lista

    }

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller iniciada");
        //Log.d - 'd' de debug

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.i("MVC_Controller", "Salvo: " + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome()); //Salva o registro
        listaVip.putString("sobreNome", pessoa.getSobreNome()); //Salva o registro
        listaVip.putString("cursoDesejado", pessoa.getCursoDesejado()); //Salva o registro
        listaVip.putString("telefoneContato", pessoa.getTelefoneContato()); //Salva o registro

        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) { //O método buscar devolve uma pessoa

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NULO"));
        pessoa.setSobreNome(preferences.getString("sobreNome", "NULO"));
        pessoa.setCursoDesejado(preferences.getString("cursoDesejado", "NULO"));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NULO"));

        return pessoa;
    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();

    }
}
