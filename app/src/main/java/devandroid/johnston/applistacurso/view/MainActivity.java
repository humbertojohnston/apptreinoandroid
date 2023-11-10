package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; //CTRL+Espaço, cria o Objeto com o mesmo nome da Classe
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

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

     /*   dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome: " + outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: " + outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: " + outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: " + outraPessoa.getTelefoneContato();
*/
        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid","Objeto outraPessoa: "+outraPessoa.toString());

        //tag é uma etiqueta que identifica o grupo de informações que se quer apresentar.
    }
}