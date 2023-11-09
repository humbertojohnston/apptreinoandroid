package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; //CTRL+Espaço, cria o Objeto com o mesmo nome da Classe
    Pessoa outraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //arquivo de layout, instancia o layout, CTRL+B abre o layout (selecionando o activity_main)

        pessoa = new Pessoa(); //criou o Objeto pessoa da Classe Pessoa
        outraPessoa = new Pessoa(); //criou o Objeto pessoa da Classe Pessoa
        //Atribuicao de valores para o objeto pessoa
        pessoa.setPrimeiroNome("Humberto");
        pessoa.setSobreNome("Pinheiro");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("91981895467");

        //Atribuicao de valores para o objeto outraPessoa
        outraPessoa.setPrimeiroNome("Johnston");
        outraPessoa.setSobreNome("Junior");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("91991895467");
int parada = 0;
    }
}