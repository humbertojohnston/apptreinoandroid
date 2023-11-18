package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.controller.PessoaController;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller; //criou-se uma instância
    Pessoa pessoa; //CTRL+Espaço, cria o Objeto com o mesmo nome da Classe
    Pessoa outraPessoa;

    //Declarando EditText
    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    //Declarando Button
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //arquivo de layout, instancia o layout, CTRL+B abre o layout (selecionando o activity_main)

        controller = new PessoaController();
        controller.toString(); //Método por Herança

        pessoa = new Pessoa(); //criou o Objeto pessoa da Classe Pessoa
        outraPessoa = new Pessoa(); //criou o Objeto pessoa da Classe Pessoa

        //Atribuicao de valores para o objeto outraPessoa
        outraPessoa.setPrimeiroNome("Johnston");
        outraPessoa.setSobreNome("Junior");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("91991895467");

        //Atribuição de dados ao EditText
        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        //Atribuição de dados ao Button
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //Implementação do botão btnLimpar
        btnLimpar.setOnClickListener(new View.OnClickListener() { //criado uma instância view)
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        //Implementação do botão btnFinalizar
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "* PROGRAMA FINALIZADO *", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        //Implementação do botão btnSalvar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pegando os dados dos campos editText
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                Toast.makeText(MainActivity.this, "* SALVO *" + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(pessoa); //cria o método salvar na controladora
            }
        });

        //Mostrando informações na tela
        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        //Para o TODO
        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());

        //tag é uma etiqueta que identifica o grupo de informações que se quer apresentar.
    }
}