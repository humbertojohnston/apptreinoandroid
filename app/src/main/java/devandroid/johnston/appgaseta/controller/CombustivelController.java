package devandroid.johnston.appgaseta.controller;

import android.content.SharedPreferences;

import devandroid.johnston.appgaseta.model.Combustivel;
import devandroid.johnston.appgaseta.view.GasEtaActivity;

public class CombustivelController {

    SharedPreferences preferences;
    SharedPreferences.Editor dadosPreferences;

    //psfs
    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController (GasEtaActivity activity) {

        preferences = activity.getSharedPreferences(NOME_PREFERENCES, 0);

        dadosPreferences = preferences.edit();
    }

    public void salvar (Combustivel combustivel){

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDoCombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao", combustivel.getRecomendacao());
        dadosPreferences.apply(); //SALVA OS DADOS

    }

    public void limpar(){

        //LIMPA OS DADOS DO SHAREDPREFERENCES
        dadosPreferences.clear();
        dadosPreferences.apply();
    }

}

